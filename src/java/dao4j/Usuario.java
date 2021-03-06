/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sat Jun 02 22:07:35 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package dao4j;

/*
 * For Table usuario
 */
public class Usuario implements java.io.Serializable, Cloneable {
    private UsuarioKey _key = new UsuarioKey();

    /* idUsuarios, PK */
    protected int idusuarios;

    /* email */
    protected String email;

    /* nombre */
    protected String nombre;

    /* apellidoPaterno */
    protected String apellidopaterno;

    /* apellidoMaterno */
    protected String apellidomaterno;

    /* username */
    protected String username;

    /* password */
    protected String password;

    /* Return the key object. */
    public UsuarioKey getKeyObject() {
        return _key;
    }

    /* idUsuarios, PK */
    public int getIdusuarios() {
        return idusuarios;
    }

    /* idUsuarios, PK */
    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
        _key.setIdusuarios(idusuarios);
    }

    /* email */
    public String getEmail() {
        return email;
    }

    /* email */
    public void setEmail(String email) {
        this.email = email;
    }

    /* nombre */
    public String getNombre() {
        return nombre;
    }

    /* nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* apellidoPaterno */
    public String getApellidopaterno() {
        return apellidopaterno;
    }

    /* apellidoPaterno */
    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    /* apellidoMaterno */
    public String getApellidomaterno() {
        return apellidomaterno;
    }

    /* apellidoMaterno */
    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    /* username */
    public String getUsername() {
        return username;
    }

    /* username */
    public void setUsername(String username) {
        this.username = username;
    }

    /* password */
    public String getPassword() {
        return password;
    }

    /* password */
    public void setPassword(String password) {
        this.password = password;
    }

    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Usuario))
            return false;

        Usuario bean = (Usuario) obj;

        if (this.idusuarios != bean.idusuarios)
            return false;

        if (this.email == null) {
            if (bean.email != null)
                return false;
        }
        else if (!this.email.equals(bean.email)) 
            return false;

        if (this.nombre == null) {
            if (bean.nombre != null)
                return false;
        }
        else if (!this.nombre.equals(bean.nombre)) 
            return false;

        if (this.apellidopaterno == null) {
            if (bean.apellidopaterno != null)
                return false;
        }
        else if (!this.apellidopaterno.equals(bean.apellidopaterno)) 
            return false;

        if (this.apellidomaterno == null) {
            if (bean.apellidomaterno != null)
                return false;
        }
        else if (!this.apellidomaterno.equals(bean.apellidomaterno)) 
            return false;

        if (this.username == null) {
            if (bean.username != null)
                return false;
        }
        else if (!this.username.equals(bean.username)) 
            return false;

        if (this.password == null) {
            if (bean.password != null)
                return false;
        }
        else if (!this.password.equals(bean.password)) 
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        Usuario bean = new Usuario();
        bean.idusuarios = this.idusuarios;
        bean.email = this.email;
        bean.nombre = this.nombre;
        bean.apellidopaterno = this.apellidopaterno;
        bean.apellidomaterno = this.apellidomaterno;
        bean.username = this.username;
        bean.password = this.password;
        return bean;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idusuarios").append(" = ").append(idusuarios).append("]").append(sep);
        sb.append("[").append("email").append(" = ").append(email).append("]").append(sep);
        sb.append("[").append("nombre").append(" = ").append(nombre).append("]").append(sep);
        sb.append("[").append("apellidopaterno").append(" = ").append(apellidopaterno).append("]").append(sep);
        sb.append("[").append("apellidomaterno").append(" = ").append(apellidomaterno).append("]").append(sep);
        sb.append("[").append("username").append(" = ").append(username).append("]").append(sep);
        sb.append("[").append("password").append(" = ").append(password).append("]").append(sep);
        return sb.toString();
    }
}