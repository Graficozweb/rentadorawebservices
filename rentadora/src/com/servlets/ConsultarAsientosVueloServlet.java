package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.flightsService.FlightsServiceProxy;
import com.flight.flightsService.Seat;

/**
 * Servlet implementation class ConsultarAsientosVueloServlet
 */
public class ConsultarAsientosVueloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarAsientosVueloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		FlightsServiceProxy proxy = new FlightsServiceProxy();
		
		Seat [] seats = proxy.getAvailableSeats(id);
		String resp = "<thead class='ui-widget-header '><tr><td>N&uacute;mero</td><td>Vuelo</td>" +
				"<td>Posicion</td><td>Costo</td><td>Clase</td></thead>";
		resp += "<tbody>";
		
		if(seats == null) {
			resp += "</tbody>";
			PrintWriter pw = response.getWriter();
			pw.print(resp);
			return;
		}
		for (int i=0 ; i < seats.length; i++) {
			resp += "<tr>";
			resp += "<td>"+seats[i].getSeatID()+"</td>";
			resp += "<td>"+seats[i].getFlight()+"</td>";
			resp += "<td>"+seats[i].getSeatPosition()+"</td>";
			resp += "<td>"+seats[i].getSeatCost()+"</td>";
			resp += "<td>"+seats[i].getSeatClass()+"</td>";
			resp += "</tr>";
		}
		resp += "</tbody>";
		PrintWriter pw = response.getWriter();
		pw.print(resp);
	}

}
