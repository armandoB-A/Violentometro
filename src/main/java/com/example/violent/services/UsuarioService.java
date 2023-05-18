package com.example.violent.services;

import com.example.violent.entities.Estado;
import com.example.violent.entities.Usuario;
import com.example.violent.entities.UsuarioDTO;
import com.example.violent.repositories.EstadoRepository;
import com.example.violent.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario guardarUsuarios(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setEdad(usuarioDTO.getEdad());
        usuario.setGenero(usuarioDTO.getGenero());
        usuario.setIdEstado(estadoRepository.findById(usuarioDTO.getIdEstado()).get());
        return usuarioRepository.save(usuario);
    }
}
