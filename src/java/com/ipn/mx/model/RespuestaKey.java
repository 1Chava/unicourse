/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue May 01 20:32:32 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.ipn.mx.model;

public class RespuestaKey implements java.io.Serializable, Cloneable {
    /* idRespuesta */
    protected int idrespuesta;

    /* Pregunta_idPregunta */
    protected int preguntaIdpregunta;

    /* idRespuesta */
    public int getIdrespuesta() {
        return idrespuesta;
    }

    /* idRespuesta */
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    /* Pregunta_idPregunta */
    public int getPreguntaIdpregunta() {
        return preguntaIdpregunta;
    }

    /* Pregunta_idPregunta */
    public void setPreguntaIdpregunta(int preguntaIdpregunta) {
        this.preguntaIdpregunta = preguntaIdpregunta;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idrespuesta).hashCode();
        hashCode += new Integer(preguntaIdpregunta).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof RespuestaKey))
            return false;

        RespuestaKey key = (RespuestaKey) obj;

        if (this.idrespuesta != key.idrespuesta)
            return false;

        if (this.preguntaIdpregunta != key.preguntaIdpregunta)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        RespuestaKey key = new RespuestaKey();
        key.idrespuesta = this.idrespuesta;
        key.preguntaIdpregunta = this.preguntaIdpregunta;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idrespuesta").append(" = ").append(idrespuesta).append("]");
        sb.append("[").append("preguntaIdpregunta").append(" = ").append(preguntaIdpregunta).append("]");
        return sb.toString();
    }
}