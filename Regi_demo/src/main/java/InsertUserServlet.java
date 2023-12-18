import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertUser")
public class InsertUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String dateOfBirthStr = request.getParameter("dateOfBirth");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
            System.out.println("db connected");

            // Parse date string to LocalDate
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

            String sql = "INSERT INTO users (name, date_of_birth, city, email, password) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setObject(2, dateOfBirth);
                stmt.setString(3, city);
                stmt.setString(4, email);
                stmt.setString(5, password);

                int rowCount = stmt.executeUpdate();
                if (rowCount > 0) {
                    response.sendRedirect("success.html"); // Redirect to success page
                } else {
                    response.sendRedirect("error.html"); // Redirect to error page
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("error.html"); // Redirect to error page
        }
    }
}
