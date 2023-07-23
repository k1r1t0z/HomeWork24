/*import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZonedDateTime;

@WebServlet("/minsk")
public class TimeMinsk extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        int hour = zonedDateTime.getHour();
        int minutes = zonedDateTime.getMinute();
        writer.println(hour + ":" + minutes);
        writer.close();
    }
}*/
