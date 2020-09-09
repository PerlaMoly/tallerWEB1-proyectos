package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MiControladorSaludar {

	@RequestMapping(path = "/saludar", method = RequestMethod.GET)
	public String saludar() {
		return "saludo";
	}
}