public class Costumer {

    private int id;
    private String address;
    private List<Code>Code

    //metodos get y set 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        final Costumer rhs = (Costumer) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj))
            .append(id, rhs.id)
            .append(address, rhs.address)
            .append(code, rhs.code)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .append(id)
            .append(address)
            .append(code)
            .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", id)
            .append("address", address)
            .append("code", code)
            .toString();
    }
}
