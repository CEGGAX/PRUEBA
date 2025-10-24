package com.iasolutions.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iasolutions.demo.Model.usuarioEntity;
import com.iasolutions.demo.Repository.usuarioRepository;

@Service
public class usuarioService {

    @Autowired
    private usuarioRepository UsuarioRepository;

    public usuarioEntity CrearUsuario(String nombre, String email, String password) {
        usuarioEntity newUsuario = new usuarioEntity();
        newUsuario.setNombreU(nombre);
        newUsuario.setEmailU(email);
        newUsuario.setPasswordU(password);
        newUsuario.setRolU(com.iasolutions.demo.Model.rol.USER);
        return UsuarioRepository.save(newUsuario);
    }

    public List<usuarioEntity> ListarUsuarios() {
        return UsuarioRepository.findAll();
    }
}
