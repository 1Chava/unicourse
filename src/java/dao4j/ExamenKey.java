/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sat Jun 02 22:07:35 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package dao4j;

public class ExamenKey implements java.io.Serializable, Cloneable {
    /* idexamen */
    protected int idexamen;

    /* idexamen */
    public int getIdexamen() {
        return idexamen;
    }

    /* idexamen */
    public void setIdexamen(int idexamen) {
        this.idexamen = idexamen;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idexamen).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof ExamenKey))
            return false;

        ExamenKey key = (ExamenKey) obj;

        if (this.idexamen != key.idexamen)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        ExamenKey key = new ExamenKey();
        key.idexamen = this.idexamen;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idexamen").append(" = ").append(idexamen).append("]");
        return sb.toString();
    }
}