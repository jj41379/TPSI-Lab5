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

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Person> listaOsob = new ArrayList<>();
        listaOsob.add(new Person("Andrzej", "Kowalski", "andrzej@kowalski.pl"));
        listaOsob.add(new Person("Jędrzej", "Nowak", "jedrzej@nowak.pl"));
        listaOsob.add(new Person("Piotr", "Kowal", "piotr@kowal.pl"));
        listaOsob.add(new Person("Wojciech", "Sosna", "wojciech@sosna.pl"));
        listaOsob.add(new Person("Hubert", "Trąbka", "hubert@trabka.pl"));
        listaOsob.add(new Person("Dariusz", "Gęś", "dariusz@ges.pl"));
        listaOsob.add(new Person("Radosław", "Kot", "radoslaw@kot.pl"));
        listaOsob.add(new Person("Kacper", "Rudzik", "kacper@rudzik.pl"));
        request.setAttribute("listaOsob", listaOsob);
        
        request.getRequestDispatcher("personList.jsp").forward(request, response); 
        }
    }
