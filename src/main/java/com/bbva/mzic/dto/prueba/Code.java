package com.bbva.mzic.dto.prueba;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Code implements Serializable  {
        private static final long serialVersionUID = 2931699728946643245L;
    
    private int id;

        //metodos get y set 

        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
//METODOS HASCODE, EQUALS, Y TOSTRING

        @Override
        public boolean equals(final Object obj) {
            if (obj == null) { return false; }
            if (obj == this) { return true; }
            if (obj.getClass() != getClass()) {
                return false;
            }
            final Code rhs = (Code) obj;
            return new EqualsBuilder().appendSuper(super.equals(obj))
                .append(id, rhs.id)
                .isEquals();
        }
    
        @Override
        public int hashCode() {
            return new HashCodeBuilder()
                .append(id)
                .toHashCode();
        }
    
        @Override
        public String toString() {
            return new ToStringBuilder(this)
                .append("id", id)
                .toString();
        }

}
