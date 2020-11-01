package WaitingList;

public class Something {

    private String What;
    private int Weight;

    public Something () {
        What = "";
        Weight = 0;
    }

    public Something (String what, int weight) {
        What = what;
        Weight = weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWhat(String what) {
        What = what;
    }

    public String getWhat() {
        return What;
    }

    @Override
    public String toString() {
        return "Something{" +
                "What='" + What + '\'' +
                ", Weight=" + Weight +
                '}';
    }
}
