package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiControladorSaludar {

	/*
	 * @RequestMapping(path = "/saludar", method = RequestMethod.GET) public
	 * ModelAndView saludar() { ModelMap modelo = new ModelMap();
	 * modelo.put("nombre", "per"); return new ModelAndView("saludo", modelo); }
	 */

//	@RequestMapping(path = "/saludar", method = RequestMethod.GET)
//	public ModelAndView saludar(@RequestParam("nombreDos") String nombreRecibido ) {
//	ModelMap modelo = new ModelMap();
//	modelo.put("nombre", nombreRecibido);
//	return new ModelAndView("saludo", modelo);
//	}

	
	// pasar un valor en la url
	/*
	 * @RequestMapping(path = "/saludar", method = RequestMethod.GET) public
	 * ModelAndView saludar(@RequestParam("nombreDos") String
	 * nombreRecibido, @RequestParam("apellido") String apellidoRecibido ) {
	 * ModelMap modelo = new ModelMap(); modelo.put("nombre", nombreRecibido);
	 * modelo.put("apellido", apellidoRecibido); return new ModelAndView("saludo",
	 * modelo); }
	 */
	
	//pasar un valor en la url pathvariable
	

	/*
	 * @RequestMapping(value = " /order/{orderId}", method=RequestMethod.GET) public
	 * String getOrder(@PathVariable String orderId){ //fetch order }
	 */
	
	@RequestMapping(value = " /saludar/{idNombre}/{idApellido}", method=RequestMethod.GET)
	public ModelAndView saludar(@PathVariable("nombreDos") String idNombre, @PathVariable("apellidoDos") String idApellido) 
	{
	ModelMap modelo = new ModelMap();
	modelo.put("nombre", idNombre);
	modelo.put("apellido", idApellido);
	return new ModelAndView("saludo", modelo);
	}
}