package musicPlayer.bbdd.pojo;

import java.io.Serializable;
import java.util.Objects;

public class PremiunPojo extends AccountPojo implements Serializable {

    private static final long serialVersionUID = -1626696079713425050L;

    private int numberCard = 0;
    private String expirationDate = null;
    private int CardVerificationValue = 0;

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCardVerificationValue() {
        return CardVerificationValue;
    }

    public void setCardVerificationValue(int cardVerificationValue) {
        CardVerificationValue = cardVerificationValue;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(CardVerificationValue, expirationDate, numberCard);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PremiunPojo other = (PremiunPojo) obj;
        return CardVerificationValue == other.CardVerificationValue
                && Objects.equals(expirationDate, other.expirationDate) && numberCard == other.numberCard;
    }

    @Override
    public String toString() {
        return "PremiunPojo [numberCard=" + numberCard + ", expirationDate=" + expirationDate
                + ", CardVerificationValue=" + CardVerificationValue + "]";
    }

}