package WhiteCatLucyServlet.cloud;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import whiteCatLucy.script.SystemScript;

/**
 * Servlet implementation class Tutorial
 */
@WebServlet("/cloudEventScript")
public class EventScript extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7160621650554458864L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public EventScript() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SystemScript tutorial = new SystemScript();
		
		tutorial.tutorial2();
		
		List<String> nowScript = tutorial.script;
		
		request.setAttribute("box", nowScript);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UI/cloud/CloudEventScript.jsp");

        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}