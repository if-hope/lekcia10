public class Breed {
    private int baseId;
    private String ownerName;

    private Cat kity;

    public Breed(int baseId, String ownerName, Cat kity) {
        this.baseId = baseId;
        this.ownerName = ownerName;
        this.kity = kity;
    }

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cat getKity() {
        return kity;

    }

    public void setKity(Cat kity) {
        this.kity = kity;
    }
}
