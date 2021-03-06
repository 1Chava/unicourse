/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sat Jun 02 22:07:35 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package dao4j;

/*
 * For Table curso
 */
public class Curso implements java.io.Serializable, Cloneable {
    private CursoKey _key = new CursoKey();

    /* idCurso, PK */
    protected int idcurso;

    /* nombre */
    protected String nombre;

    /* Return the key object. */
    public CursoKey getKeyObject() {
        return _key;
    }

    /* idCurso, PK */
    public int getIdcurso() {
        return idcurso;
    }

    /* idCurso, PK */
    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
        _key.setIdcurso(idcurso);
    }

    /* nombre */
    public String getNombre() {
        return nombre;
    }

    /* nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Curso))
            return false;

        Curso bean = (Curso) obj;

        if (this.idcurso != bean.idcurso)
            return false;

        if (this.nombre == null) {
            if (bean.nombre != null)
                return false;
        }
        else if (!this.nombre.equals(bean.nombre)) 
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        Curso bean = new Curso();
        bean.idcurso = this.idcurso;
        bean.nombre = this.nombre;
        return bean;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idcurso").append(" = ").append(idcurso).append("]").append(sep);
        sb.append("[").append("nombre").append(" = ").append(nombre).append("]").append(sep);
        return sb.toString();
    }
}