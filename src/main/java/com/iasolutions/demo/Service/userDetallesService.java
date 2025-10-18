package com.iasolutions.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iasolutions.demo.Model.usuarioEntity;
import com.iasolutions.demo.Repository.usuarioRepository;

@Service
public class userDetallesService implements UserDetailsService {

    @Autowired
    private usuarioRepository UsuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       usuarioEntity usuario = UsuarioRepository.findByNombreU(username)
       .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado:"));

       GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + usuario.getRolU().name());
       return new org.springframework.security.core.userdetails.User(
        usuario.getNombreU(),
        usuario.getPasswordU(),
        List.of(authority)
       );
    }
}
