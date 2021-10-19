package controller;
import javax.servlet.RequestDispatcher;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;



@WebServlet(name = "RequestServlet")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        //date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        HttpSession session = request.getSession();
        String firstname = request.getParameter("firstname").toString();
        String lastname = request.getParameter("lastname").toString();
        String Requester = request.getParameter("Requester").toString();
        String equip_repair = request.getParameter("Equip_repair").toString();
        String reason_repair = request.getParameter("Reason_repair").toString();
        String Requset_At = dtf.format(now);
        System.out.print(Requset_At);
        session.setAttribute("Requset_At",Requset_At);
        session.setAttribute("firstname",firstname);
        session.setAttribute("lastname",lastname);
        session.setAttribute("Requester",Requester);
        session.setAttribute("Equip_repair",equip_repair);
        session.setAttribute("Reason_repair",reason_repair);

        request.setAttribute("Requset_At",Requset_At);
        request.setAttribute("firstname",firstname);
        request.setAttribute("lastname",lastname);
        request.setAttribute("Requester",Requester);
        request.setAttribute("Equip_repair",equip_repair);
        request.setAttribute("Reason_repair",reason_repair);


        try{
            Query q = new Query();

            request.setAttribute("status", "true");
            RequestDispatcher rd = request.getRequestDispatcher("/Approve.jsp");
            rd.forward(request, response);
        }
        catch(Exception e){
            e.printStackTrace();
            String json = String.format("{\"status\": \"false\",\n\"msg\": \"%s\"}",e.toString());
            out.print(json);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}

