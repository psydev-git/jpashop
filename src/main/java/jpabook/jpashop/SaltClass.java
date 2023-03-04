package jpabook.jpashop;

public class SaltClass  <E extends Comparable<E>> {
    private String saltId;

    public SaltClass() {
        this.saltId = "히말라야";
    }

    public String getSaltId() {
        return saltId;
    }

    public void setSaltId(String saltId) {
        this.saltId = saltId;
    }
}
