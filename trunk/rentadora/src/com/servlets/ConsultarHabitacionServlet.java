package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tumbadero.www.hotel.Habitacion;
import com.tumbadero.www.hotel.HotelProxy;

/**
 * Servlet implementation class ConsultarHabitacionServlet
 */
public class ConsultarHabitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletConfig config;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarHabitacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
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
		HotelProxy proxy = new HotelProxy();
		String par = request.getParameter("libre");
		boolean libre = true;
		
		if(par.compareToIgnoreCase("false") == 0) {
			libre = false;
		}
		
		
		Habitacion [] habs = proxy.consultarHabitacion(libre);
		String resp = "<thead class='ui-widget-header '><tr><td>N&uacute;mero</td><td>Libre</td><td>Tipo</td><td>Tama&ntilde;o</td>" +
			"<td>Capacidad</td><td>Precio por noche</td><td>Opciones</td></tr></thead>";
		resp += "<tbody>";
		if (habs == null) {
			resp += "</tbody>";
			response.getWriter().print(resp);
			return;
		}
		
		for (int i=0 ; i < habs.length; i++) {
			resp += "<tr>";
			resp += "<td>"+habs[i].getIdHabitacion()+"</td>";
			String libs = "No";
			if(habs[i].isLibre()) {
				libs = "Si";
			}
			resp += "<td>"+libs+"</td>";
			resp += "<td>"+habs[i].getTipo()+"</td>";
			resp += "<td>"+habs[i].getTamanio()+"</td>";
			resp += "<td>"+habs[i].getCapacidad()+"</td>";
			resp += "<td>"+habs[i].getPrecioNoche()+"</td>";
			if (habs[i].isLibre()) {
				resp += "<td><button id='create-reser' onclick='iniciarReservacion("+habs[i].getIdHabitacion()+");'>Reservar</button></td>";
			} else {
				resp += "<td></td>";
			}
			
			resp += "</tr>";
		}
		resp += "</tbody>";
		PrintWriter pw = response.getWriter();
		pw.print(resp);
		//System.out.println("llegooooooooooo "+libre + " " + resp);
	}

}
