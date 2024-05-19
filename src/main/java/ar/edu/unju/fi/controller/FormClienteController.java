package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormClienteController {

	@RequestMapping(value="/form-cliente", method=RequestMethod.GET)
	public String getFormCliente() {
		return "form-cliente";
	}
}
