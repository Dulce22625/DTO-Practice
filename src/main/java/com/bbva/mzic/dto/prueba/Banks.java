
package com.bbva.mzic.dto.prueba;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
public class Banks  implements Serializable  {
        private static final long serialVersionUID = 2931699728946643245L;
    
    private int id;
    private String name;
    private List<Code>Code

// Getters y Setters
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Code> getCode() {
        return code;
    }

    public void setCode(List<Code> code) {
        this.code = code;
    }

//METODOS HASCODE, EQUALS, Y TOSTRING

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        final Banks rhs = (Banks) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj))
            .append(id, rhs.id)
            .append(name, rhs.name)
            .append(code, rhs.code)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .append(id)
            .append(name)
            .append(code)
            .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", id)
            .append("name", name)
            .append("code", code)
            .toString();
    }

}
