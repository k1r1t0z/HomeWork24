package HomeWork25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.time.LocalTime;

@WebServlet("/load-book")
@MultipartConfig(maxFileSize = 1024 * 1024 * 10, fileSizeThreshold = 1024 * 1024)
public class BookUploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        int minutes = localTime.getMinute();
        int second = localTime.getSecond();
        System.out.println("Время запроса: " + hour + ":" + minutes + ":" + second);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("I'm working!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("file");
        String name = part.getSubmittedFileName();
        part.write("/home/kiritoz/" + name);
        resp.getWriter().println("Okay");
    }
}
