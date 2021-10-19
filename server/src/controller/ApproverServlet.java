package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@WebServlet(name = "ApproverServlet")
public class ApproverServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        try{
            HttpSession session = request.getSession();
            String firstname = session.getAttribute("firstname").toString();
            String lastname = session.getAttribute("lastname").toString();
            String Requester = session.getAttribute("Requester").toString();
            String equip_repair = session.getAttribute("Equip_repair").toString();
            String reason_repair = session.getAttribute("Reason_repair").toString();
            String Requset_At = session.getAttribute("Requset_At").toString();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            Query q = new Query();
            String Approver = request.getParameter("Approver");
            String Requestatus = request.getParameter("Requestatus");
            String Approve_at = dtf.format(now);
            q.addRequest(firstname, lastname,Requester, equip_repair, reason_repair,Requset_At,Requestatus,Approver,Approve_at);
            request.setAttribute("status","true");
            RequestDispatcher rd = request.getRequestDispatcher("/Approve.jsp");
            rd.forward(request,response);




            request.setAttribute("firstname",firstname);
            request.setAttribute("lastname",lastname);
            request.setAttribute("Requester",Requester);
            request.setAttribute("Equip_repair",equip_repair);
            request.setAttribute("Reason_repair",reason_repair);
            request.setAttribute("Requset_At",Requset_At);
            System.out.println("Hello");
            System.out.print(Requset_At);







        }
        catch (Exception e){
            e.printStackTrace();
            String json = String.format("{\"status\": \"false\",\n\"msg\": \"%s\"}",e.toString());
            out.print(json);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
