import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    public FirstServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().printf("<html><body> Products: <ul>");
        for (int i = 1; i < 11; i++) {
            response.getWriter().printf("<li>" + new Product(i).toString() + "</li>");
        }
        response.getWriter().printf("</ul></body></html>");
    }

}
