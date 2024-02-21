package question_1_29_Prefecture;

public class Prefecture {
	private String name;
    private String capital;
    private int area;

    public Prefecture(String name, String capital, int area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getArea() {
        return area;
    }

    public String toString() {
        return "都道府県名：" + name + "\n県庁所在地：" + capital + "\n面積：" + String.format("%.1f", (float)area) + "km2";
    }
}