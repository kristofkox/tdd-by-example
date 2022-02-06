package guru.springframework;

import java.util.Objects;

public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public static Money dollar(int ammount) {
        return new Dollar(ammount);
    }

    public static Money franc(int ammount) {
        return new Franc(ammount);
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && this.getClass().equals(o.getClass());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Money money = (Money) o;
//        return amount == money.amount;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(amount);
//    }
}
