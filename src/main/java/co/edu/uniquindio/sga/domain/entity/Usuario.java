package co.edu.uniquindio.sga.domain.entity;

import java.util.Objects;

import co.edu.uniquindio.sga.domain.valueobject.DocumentoIdentidad;

public class Usuario {
    private DocumentoIdentidad usuario;
    private String contrasena;

    private Usuario(DocumentoIdentidad usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        if (contrasena == null) {
            if (other.contrasena != null)
                return false;
        } else if (!contrasena.equals(other.contrasena))
            return false;
        return true;
    }

}
