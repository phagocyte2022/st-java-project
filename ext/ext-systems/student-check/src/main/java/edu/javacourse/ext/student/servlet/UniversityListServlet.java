package edu.javacourse.ext.student.servlet;

import edu.javacourse.ext.student.domain.University;
import edu.javacourse.ext.student.service.UniversityService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UniversityListServlet", urlPatterns = {"/universityList"})
public class UniversityListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext ctx = getServletContext();
        WebApplicationContext webCtx = WebApplicationContextUtils.getWebApplicationContext(ctx);
        UniversityService service = webCtx.getBean(UniversityService.class);
        List<University> list = service.findUniversities();
        list.forEach(u -> System.out.println(u.getUniversityId()+": " + u.getUniversityName() + ": " + u.getFaculties().size()));

        getServletContext().getRequestDispatcher("/universityList.jsp").forward(req, resp);
    }
}
