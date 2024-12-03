import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Capstone extends HttpServlet
{
        public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException
        {
                response.setContentType("text/html");
                PrintWriter Printer = response.getWriter();
                Printer.println("<html>");
                Printer.println("<head>");
                Printer.println("\t<title>Student Database</title>");
                Printer.println("</head>");
                Printer.println("<body>");
                Printer.println("<b>Student Database Starter Servlet</b>");
                Printer.println("</body>");
                Printer.println("</html>");
                return;
        }
}

