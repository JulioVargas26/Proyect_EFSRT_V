package com.proyect.controller;/*
package com.proyect.controller;

import java.util.List;

import com.proyect.entity.Enlace;
import com.proyect.entity.Usuario;
import com.proyect.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"datosUsuario","ENLACES","CODIGOUSUARIO"})
@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	



	@RequestMapping("/intranet")
	public String intranet(Authentication auth, Model model) {
		String vLogin=auth.getName();
		//invocar al método validarSesion
		Usuario bean=usuarioService.validarSesion(vLogin);
		//invocar al método enlacesDelUsuario
		List<Enlace> lista=usuarioService.enlacesDelUsuario(bean.getRol().getIdrol());
		//asignar valor a los atributos de tipo sesión
		model.addAttribute("datosUsuario",bean.getApellido_mat()+
					" "+bean.getNombre());
		model.addAttribute("ENLACES",lista);
		model.addAttribute("CODIGOUSUARIO", bean.getId_user());
		return "intranet";
	}
}
*/
