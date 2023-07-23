package TestAge;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@WebServlet("/age")
public class Age extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Scanner scanner = new Scanner(System.in);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        int age = Integer.parseInt(req.getParameter("age"));
        if (age < 18) {
            writer.println("Несовершеннолетний");
        } else {
            writer.println("Совершеннолетий");
        }
    }
}
