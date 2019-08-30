package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RandomNumberServlet")
public class RandomNumberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 숫자 0~32중 하나 가져오는 로직
		Random rand= new Random();
		int target = rand.nextInt(33);
		PrintWriter pw = response.getWriter();
		pw.print(target);
	}
}
