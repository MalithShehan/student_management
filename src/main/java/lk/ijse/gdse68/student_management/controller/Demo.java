package lk.ijse.gdse68.student_management.controller;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.gdse68.student_management.DTO.StudentDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (urlPatterns = "/demo")
public class Demo extends HttpServlet {
    @Override
    public void init() throws ServletException {
        var initParameter = getServletContext().getInitParameter("myparam");
        System.out.println(initParameter);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jsonb jsonb = JsonbBuilder.create();
        List<StudentDTO> studentList = jsonb.fromJson(req.getReader(), new ArrayList<StudentDTO>() {
        }.getClass()
                .getGenericSuperclass());
        studentList.forEach(System.out::println);
    }
}