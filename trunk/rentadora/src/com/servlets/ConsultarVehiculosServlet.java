package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carrental.rentadora.Vehiculo;
import com.carrental.services.VehiculoServices;

/**
 * Servlet implementation class ConsultarVehiculosServlet
 */
public class ConsultarVehiculosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarVehiculosServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		VehiculoServices serv = new VehiculoServices();
		
		ArrayList<Vehiculo> vehs = serv.consultarVehiculos(0, "", 0, 0);
		String resp=	"<thead class='ui-widget-header '>"+
		"<tr>"+
		"<td>Codigo</td>"+
		"<td>A&ntilde;o</td>"+
		"<td>Precio por dia</td>"+
		"<td>Disponible</td>"+
		"<td>Modelo</td>"+
		"<td>Capacidad</td>"+
		"<td>Clave</td>"+
		"</tr>"+	
		"</thead>";
		resp += "<tbody>";
		for (Vehiculo v : vehs) {
			resp +="<tr>";
			
			resp +="<td>"+v.getIdVehiculo()+"</td>";
			resp +="<td>"+v.getAnioModelo()+"</td>";
			resp +="<td>"+v.getPrecioPorDia()+"</td>";
			String rent = v.getEstaRentado()? "No":"Si";
			
			resp +="<td>"+rent+"</td>";	
			resp +="<td>"+v.getModelo()+"</td>";	
			resp+="<td>"+v.getNumper()+"</td>";	
			resp +="<td>"+v.getNumserial()+"</td>";	
			resp +="</tr>";
		}
		resp += "</tbody>";
		
		response.getWriter().print(resp);
	}

}
