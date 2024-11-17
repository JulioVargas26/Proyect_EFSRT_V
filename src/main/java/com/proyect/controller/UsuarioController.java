/*
package com.proyect.controller;

import com.proyect.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();


@RequestMapping("/grabar")
    public String grabarModel(@RequestParam("codigo") Integer cod,
                              @RequestParam("nombre") String nom,
                              @RequestParam("login") String log,
                              @RequestParam("clave") String cla,
                              @RequestParam("telefono") String tel,
                              @RequestParam("correo") String cor,
                              @RequestParam("rol") int rol,

                              RedirectAttributes redirect) {
        try {

            Usuario pm = new Usuario();

            pm.setNombre(nom);
            pm.setLogin(log);
            pm.setClave(encoder.encode(cla));
            pm.setTelefono(tel);
            pm.setCorreo(cor);

            Rol cm = new Rol();
            cm.setIdrol(rol);
            pm.setRol(cm);


            if (cod == 0) {
                serAl.grabar(pm);
                redirect.addFlashAttribute("MENSAJE", "ALMACENERO REGISTRADO");
            } else {
                pm.setIdalmacenero(cod);
                serAl.actualizar(pm);
                redirect.addFlashAttribute("MENSAJE", "ALMACENERO ACTUALIZADO");
            }

        } catch (Exception e) {
            // TODO: handle exception
            redirect.addFlashAttribute("mensaje", "Error en el Registro");
            e.printStackTrace();
        }
        return "redirect:/almacenero/lista";
    }

    //ruta (URL) para buscar por código
    @RequestMapping("/buscar")
    @ResponseBody
    public Usuario buscar(@RequestParam("Codigo") int cod) {
        return serAl.buscar(cod);
    }

    //ruta (URL) para eliminar por código
    @RequestMapping("/eliminar")
    public String eliminar(@RequestParam("Codigo") int cod, RedirectAttributes redirect) {
        try {
            serAl.eliminar(cod);
            redirect.addFlashAttribute("MENSAJE", "Registro eliminado correctamente");
        } catch (Exception e) {
            redirect.addFlashAttribute("MENSAJE", "Error en la eliminación de producto");
            e.printStackTrace();
        }
        return "redirect:/almacenero/lista";
    }


}
*/
