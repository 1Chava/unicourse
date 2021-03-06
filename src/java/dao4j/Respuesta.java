/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Sat Jun 02 22:07:35 CDT 2018
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package dao4j;

/*
 * For Table respuesta
 */
public class Respuesta implements java.io.Serializable, Cloneable {
    private RespuestaKey _key = new RespuestaKey();

    /* idRespuesta, PK */
    protected int idrespuesta;

    /* texto */
    protected String texto;

    /* Pregunta_idPregunta, PK */
    protected int preguntaIdpregunta;

    /* Return the key object. */
    public RespuestaKey getKeyObject() {
        return _key;
    }

    /* idRespuesta, PK */
    public int getIdrespuesta() {
        return idrespuesta;
    }

    /* idRespuesta, PK */
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
        _key.setIdrespuesta(idrespuesta);
    }

    /* texto */
    public String getTexto() {
        return texto;
    }

    /* texto */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /* Pregunta_idPregunta, PK */
    public int getPreguntaIdpregunta() {
        return preguntaIdpregunta;
    }

    /* Pregunta_idPregunta, PK */
    public void setPreguntaIdpregunta(int preguntaIdpregunta) {
        this.preguntaIdpregunta = preguntaIdpregunta;
        _key.setPreguntaIdpregunta(preguntaIdpregunta);
    }

    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Respuesta))
            return false;

        Respuesta bean = (Respuesta) obj;

        if (this.idrespuesta != bean.idrespuesta)
            return false;

        if (this.texto == null) {
            if (bean.texto != null)
                return false;
        }
        else if (!this.texto.equals(bean.texto)) 
            return false;

        if (this.preguntaIdpregunta != bean.preguntaIdpregunta)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        Respuesta bean = new Respuesta();
        bean.idrespuesta = this.idrespuesta;
        bean.texto = this.texto;
        bean.preguntaIdpregunta = this.preguntaIdpregunta;
        return bean;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idrespuesta").append(" = ").append(idrespuesta).append("]").append(sep);
        sb.append("[").append("texto").append(" = ").append(texto).append("]").append(sep);
        sb.append("[").append("preguntaIdpregunta").append(" = ").append(preguntaIdpregunta).append("]").append(sep);
        return sb.toString();
    }
}