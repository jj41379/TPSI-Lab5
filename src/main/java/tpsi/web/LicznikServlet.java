package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LicznikServlet", urlPatterns = {"/licznik"})
public class LicznikServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();
            Integer licznik = (Integer)session.getAttribute("licznik");
            if(licznik != null){
                licznik++;
            }
            else licznik = 1;
            
    session.setAttribute("licznik",licznik);
    
    List<Person> studenci = (List<Person>) session.getAttribute("listaStudentow");
    if(studenci!=null){
        
        session.setAttribute("listaStudentow", studenci);
        request.getRequestDispatcher("licznik.jsp").forward(request, response);
    }
    
    else{
        studenci = new ArrayList<>();
        session.setAttribute("listaStudentow", studenci);
        request.getRequestDispatcher("licznik.jsp").forward(request, response);
    }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();
            Person osoba = new Person(request.getParameter("imie"), request.getParameter("nazwisko"), request.getParameter("email"));
            List<Person> studenci = (List<Person>) session.getAttribute("listaStudentow");
            studenci.add(osoba);
            session.setAttribute("listaStudentow", studenci);
            request.getRequestDispatcher("licznik.jsp").forward(request, response);
    }    
}