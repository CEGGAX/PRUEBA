package com.iasolutions.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iasolutions.demo.Model.usuarioEntity;
import com.iasolutions.demo.Service.usuarioService;

@Controller
@RequestMapping("/Usuarios")
public class usuarioController {
    @Autowired
    usuarioService UsuarioService;
    
    @PostMapping("/crear")
    public String insertarUsuario(usuarioEntity usuario) {
        UsuarioService.CrearUsuario(
            usuario.getNombreU(),
            usuario.getEmailU(),
            usuario.getPasswordU()
        );
        return "redirect:/sesion";
    }

    @GetMapping
    public ResponseEntity<List<usuarioEntity>> mostrarUsuarios() {
        List<usuarioEntity> UsersList = UsuarioService.ListarUsuarios();
        return ResponseEntity.ok(UsersList);
    }
}
