package com.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.flightsService.FlightsServiceProxy;
import com.tumbadero.www.hotel.Cliente;
import com.tumbadero.www.hotel.Habitacion;
import com.tumbadero.www.hotel.HotelProxy;
import com.tumbadero.www.hotel.Reservacion;

/**
 * Servlet implementation class ReservarHabitacionServlet
 */
public class ReservarHabitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservarHabitacionServlet() {
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

		String nombre = request.getParameter("nombre");
		String ape = request.getParameter("apellido");
		//String fecha = request.getParameter("fecha");
		String id = request.getParameter("id");
		
		Habitacion hab = new Habitacion();
		hab.setIdHabitacion(Integer.valueOf(id));
		hab.setLibre(true);
		hab.setCapacidad(0);
		hab.setTamanio("asd");
		hab.setPrecioNoche(100.10F);
		hab.setTipo("asd");
		
		Cliente cliente = new Cliente();
		cliente.setIdCliente(0);
		cliente.setApellido(ape);
		cliente.setNombre(nombre);
		
		Date fechas = new GregorianCalendar().getTime();
		Reservacion reservacion = new Reservacion();
		reservacion.setIdReservacion(0);
		reservacion.setCliente(cliente);
		reservacion.setHabitacion(hab);
		reservacion.setFecha(fechas);
		HotelProxy proxy = new HotelProxy();
		String resp = proxy.reservarHabitacion(reservacion);
		System.out.println(resp);
		response.getWriter().print(resp);
	}

}
