/*import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet("/beijing")
public class TimeBeijing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        ZoneId zoneId = ZoneId.of("GMT+8");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        int hour = zonedDateTime.getHour();
        int minutes = zonedDateTime.getMinute();
        writer.println(hour + ":" + minutes);
        writer.close();
    }
}*/
