//task #6
public class Printer {

    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;

    public Printer (String manufacturer, String model, boolean isColor, boolean isDuplex, String type) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isColor = isColor;
        this.isDuplex = isDuplex;
        this.type = type;
    }

    public boolean fillUp(int tonerVolume, String color) {
        switch (color) {
            case "black":
                if (tonerLevelBlack == 100) return false;
                tonerLevelBlack += tonerVolume;
                if (tonerLevelBlack>100) tonerLevelBlack = 100;
                return true;
            case "magenta":
                if (tonerLevelMagenta == 100) return false;
                tonerLevelMagenta += tonerVolume;
                if (tonerLevelMagenta>100) tonerLevelMagenta = 100;
                return true;
            case "yellow":
                if (tonerLevelYellow == 100) return false;
                tonerLevelYellow += tonerVolume;
                if (tonerLevelYellow>100) tonerLevelYellow = 100;
                return true;
            case "blue":
                if (tonerLevelBlue == 100) return false;
                tonerLevelBlue += tonerVolume;
                if (tonerLevelBlue>100) tonerLevelBlue = 100;
                return true;
            default:
                return false;
        }
    }

    public void print(int pages, String color, boolean isDuplex) {
//        int pages_total = 0;

//        if (isDuplex) pages_total = 2*pages;
//        else pages_total = pages;

        switch (color) {
            case "black":

                if ((isDuplex && tonerLevelBlack<2) || (!isDuplex && tonerLevelBlack<1)) {
                    System.out.println("Toner is too low!");
                    break;
                }

                if (isDuplex) {
                    tonerLevelBlack -= 2*pages;
                    printedPages += 2*pages;
                }
                else {
                    tonerLevelBlack -= pages;
                    printedPages += pages;
                }
                break;

            case "magenta":

                if ((isDuplex && tonerLevelMagenta<2) || (!isDuplex && tonerLevelMagenta<1)) {
                    System.out.println("Toner is too low!");
                    break;
                }

                if (isDuplex) {
                    tonerLevelMagenta -= 2*pages;
                    printedPages += 2*pages;
                }
                else {
                    tonerLevelMagenta -= pages;
                    printedPages += pages;
                }
                break;

            case "yellow":

                if ((isDuplex && tonerLevelYellow<2) || (!isDuplex && tonerLevelYellow<1)) {
                    System.out.println("Toner is too low!");
                    break;
                }

                if (isDuplex) {
                    tonerLevelYellow -= 2*pages;
                    printedPages += 2*pages;
                }
                else {
                    tonerLevelYellow -= pages;
                    printedPages += pages;
                }
                break;

            case "blue":

                if ((isDuplex && tonerLevelBlue<2) || (!isDuplex && tonerLevelBlue<1)) {
                    System.out.println("Toner is too low!");
                    break;
                }

                if (isDuplex) {
                    tonerLevelBlue -= 2*pages;
                    printedPages += 2*pages;
                }
                else {
                    tonerLevelBlue -= pages;
                    printedPages += pages;
                }
                break;

        }
    }

    public boolean tonerIsEmpty() {
        return (tonerLevelBlack==0 && tonerLevelYellow==0 && tonerLevelMagenta==0 && tonerLevelBlue==0);
    }

    public int getTonerLevel(String toner) {
        switch (toner) {
            case "black":
                return tonerLevelBlack;
            case "magenta":
                return tonerLevelMagenta;
            case "yellow":
                return tonerLevelYellow;
            case "blue":
                return tonerLevelBlue;
            default:
                return -1;
        }
    }

    public int getPages() {
        return printedPages;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Colored: " + isColor);
        System.out.println("Duplex: " + isDuplex);
        System.out.println("Type: " + type);
        System.out.println();
        System.out.println("Black level: " + tonerLevelBlack);
        System.out.println("Magenta level: " + tonerLevelMagenta);
        System.out.println("Yellow level: " + tonerLevelYellow);
        System.out.println("Blue level: " + tonerLevelBlue);
        System.out.println();
        System.out.println("Total pages printed: " + printedPages);
    }

    public static void main(String[] args) {
        Printer hplaserjet1018 = new Printer("Hewlett Packard","LaserJet 1018", false, true, "home");

        System.out.println("Is it empty? " + hplaserjet1018.tonerIsEmpty());

        hplaserjet1018.fillUp(5,"black");
        System.out.println("Is it empty? " + hplaserjet1018.tonerIsEmpty());
        System.out.println("Black level is " + hplaserjet1018.getTonerLevel("black"));

        hplaserjet1018.print(2,"black",false);
        System.out.println("Is it empty? " + hplaserjet1018.tonerIsEmpty());
        System.out.println("Black level is " + hplaserjet1018.getTonerLevel("black"));
        System.out.println("Total pages printed " + hplaserjet1018.getPages());

        hplaserjet1018.print(1,"black",true);
        System.out.println("Is it empty? " + hplaserjet1018.tonerIsEmpty());
        System.out.println("Black level is " + hplaserjet1018.getTonerLevel("black"));
        System.out.println("Total pages printed " + hplaserjet1018.getPages());

        hplaserjet1018.print(1,"magenta",true);
        System.out.println("Is it empty? " + hplaserjet1018.tonerIsEmpty());
        System.out.println("Magenta level is " + hplaserjet1018.getTonerLevel("magenta"));
        System.out.println("Total pages printed " + hplaserjet1018.getPages());

        System.out.println();
        hplaserjet1018.displayInfo();



    }

}
