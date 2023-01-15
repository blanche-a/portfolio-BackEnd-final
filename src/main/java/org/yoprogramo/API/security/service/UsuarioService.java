package org.yoprogramo.API.security.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yoprogramo.API.security.entity.Usuario;
import org.yoprogramo.API.security.repository.IUsuarioRepository;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepository;
    
    public Optional<Usuario> getNombreByUsuario(String nombreUsuario) {
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreusuario(String nombreUsuario) {
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email) {
        return iUsuarioRepository.existsByEmail(email);
    }
    public void save(Usuario usuario) {
        iUsuarioRepository.save(usuario);
    }
}
