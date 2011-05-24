package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.daos.ReservacionDao;
import com.carrental.rentadora.Reservacion;

/**
 * Servlet implementation class ConsultarReservacionesServlet
 */
public class ConsultarReservacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarReservacionesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservacionDao dao = new ReservacionDao();
		List<Reservacion> list = dao.listReserv();
		
		String resp=	"<thead class='ui-widget-header '>"+
		"<tr>"+
		"<td>Numero</td>"+
		"<td>Cliente</td>"+
		"<td>Fecha inicio</td>"+
		"<td>Fecha Fin</td>"+
		"<td>Modelo de Vehiculo</td>"+
		"</tr>"+	
		"</thead>";
		resp += "<tbody>";
		
		for(Reservacion r : list) {
			resp +="<tr>";
			
			resp +="<td>"+r.getIdReservacion()+"</td>";
			resp +="<td>"+r.getCliente()+"</td>";
			resp +="<td>"+r.getFechainicio()+"</td>";
			
			resp +="<td>"+r.getFechainicio()+"</td>";	
			resp +="<td>"+r.getVehiculo().getModelo()+"</td>";	
			resp +="</tr>";
		}
		resp += "</tbody>";
		
		response.getWriter().print(resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
