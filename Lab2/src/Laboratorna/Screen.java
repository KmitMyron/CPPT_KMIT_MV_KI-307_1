package Laboratorna;
public class Screen
{
    private String expansion;
    private int frequency;

    public Screen(String expansion, int frequency)
    {
        this.expansion = expansion;
        this.frequency = frequency;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Screen{ " +
                "expansion = '" + expansion + '\'' +
                ", frequency = " + frequency +
                "}";
    }
}
