public class LetterCredits {

    private String letter;
    private String reference;
    private int sequence;
    private List<Bank> banks;
    private Costumer costumer;


    //metodos get y set 
//letter
    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
//reference
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
//sequence
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
//banks
    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

//METODOS HASCODE, EQUALS, Y TOSTRING

@Override
public boolean equals(final Object obj) {
    if (obj == null) { return false; }
    if (obj == this) { return true; }
    if (obj.getClass() != getClass()) {
        return false;
    }
    final LetterCredits rhs = (LetterCredits) obj;
    return new EqualsBuilder().appendSuper(super.equals(obj))
        .append(letter, rhs.letter)
        .append(reference, rhs.reference)
        .append(sequence, rhs.sequence)
        .append(banks, rhs.banks)
        .append(costumer, rhs.costumer)
        .isEquals();
}

@Override
public int hashCode() {
    return new HashCodeBuilder()
        .append(letter)
        .append(reference)
        .append(sequence)
        .append(banks)
        .append(costumer)
        .toHashCode();
}

@Override
public String toString() {
    return new ToStringBuilder(this)
        .append("letter", letter)
        .append("reference", reference)
        .append("sequence", sequence)
        .append("banks", banks)
        .append("costumer", costumer)
        .toString();
}

}

