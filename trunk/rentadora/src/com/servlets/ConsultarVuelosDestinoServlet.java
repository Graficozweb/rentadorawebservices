package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.flightsService.Flight;
import com.flight.flightsService.FlightsServiceProxy;

/**
 * Servlet implementation class ConsultarVuelosDestinoServlet
 */
public class ConsultarVuelosDestinoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarVuelosDestinoServlet() {
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
		FlightsServiceProxy proxy = new FlightsServiceProxy();
		String destiny = request.getParameter("destino");
		Flight [] fligths = proxy.searchFlightByDestiny(destiny);
		
		String resp = "<thead class='ui-widget-header '><tr><td>N&uacute;mero</td><td>Destino</td>" +
				"<td>Tipo</td><td>Clase</td><td>Operaciones</td></thead>";
		resp += "<tbody>";
		for (int i=0 ; i < fligths.length; i++) {
			resp += "<tr>";
			resp += "<td>"+fligths[i].getFlightID()+"</td>";
			resp += "<td>"+fligths[i].getDestiny()+"</td>";
			resp += "<td>"+fligths[i].getType()+"</td>";
			resp += "<td>"+fligths[i].getFligthClass()+"</td>";
			resp += "<td><button onclick='verAsientos("+fligths[i].getFlightID()+")'>Ver Asientos</button></td>";
			resp += "</tr>";
		}
		resp += "</tbody>";
		PrintWriter pw = response.getWriter();
		pw.print(resp);
	}

}
