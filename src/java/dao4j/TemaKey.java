/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sat Jun 02 22:07:35 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package dao4j;

public class TemaKey implements java.io.Serializable, Cloneable {
    /* idTema */
    protected int idtema;

    /* Curso_idCurso */
    protected int cursoIdcurso;

    /* examen_idexamen */
    protected int examenIdexamen;

    /* idTema */
    public int getIdtema() {
        return idtema;
    }

    /* idTema */
    public void setIdtema(int idtema) {
        this.idtema = idtema;
    }

    /* Curso_idCurso */
    public int getCursoIdcurso() {
        return cursoIdcurso;
    }

    /* Curso_idCurso */
    public void setCursoIdcurso(int cursoIdcurso) {
        this.cursoIdcurso = cursoIdcurso;
    }

    /* examen_idexamen */
    public int getExamenIdexamen() {
        return examenIdexamen;
    }

    /* examen_idexamen */
    public void setExamenIdexamen(int examenIdexamen) {
        this.examenIdexamen = examenIdexamen;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idtema).hashCode();
        hashCode += new Integer(cursoIdcurso).hashCode();
        hashCode += new Integer(examenIdexamen).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof TemaKey))
            return false;

        TemaKey key = (TemaKey) obj;

        if (this.idtema != key.idtema)
            return false;

        if (this.cursoIdcurso != key.cursoIdcurso)
            return false;

        if (this.examenIdexamen != key.examenIdexamen)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        TemaKey key = new TemaKey();
        key.idtema = this.idtema;
        key.cursoIdcurso = this.cursoIdcurso;
        key.examenIdexamen = this.examenIdexamen;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idtema").append(" = ").append(idtema).append("]");
        sb.append("[").append("cursoIdcurso").append(" = ").append(cursoIdcurso).append("]");
        sb.append("[").append("examenIdexamen").append(" = ").append(examenIdexamen).append("]");
        return sb.toString();
    }
}