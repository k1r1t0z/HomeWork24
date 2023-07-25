package HomeWork25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.time.LocalTime;

@WebServlet("/book")
public class BookLoadServlet extends HttpServlet {
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
        System.out.println("I'm working");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String fName = "Eugene_Onegin.txt";
        String fPath = "/home/kiritoz/Загрузки/Книги/";
        resp.setContentType("application/octet-stream");
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + fName + "\"");
        FileInputStream fileInputStream = new FileInputStream(fPath + fName);
        int i;
        while((i = fileInputStream.read()) != -1) {
            writer.write(i);
        }
        fileInputStream.close();
        writer.close();
    }
}
