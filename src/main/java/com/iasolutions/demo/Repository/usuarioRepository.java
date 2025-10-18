package com.iasolutions.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iasolutions.demo.Model.usuarioEntity;

public interface usuarioRepository extends JpaRepository<usuarioEntity, Long> {
    Optional<usuarioEntity> findByNombreU(String nombreU);
}
