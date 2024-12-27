class Distance {
    private int feet;
    private float inches;

    // Constructor
    public Distance(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two Distance objects
    public Distance add(Distance d) {
        int totalFeet = this.feet + d.feet;
        float totalInches = this.inches + d.inches;

        if (totalInches >= 12) {
            totalFeet += (int) (totalInches / 12);
            totalInches %= 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to compare two Distance objects
    public boolean isEqual(Distance d) {
        return this.feet == d.feet && this.inches == d.inches;
    }

    // Method to display Distance
    public void display() {
        System.out.println(feet + " feet, " + inches + " inches");
    }
}


public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8.5f);
        Distance d2 = new Distance(3, 4.7f);

        Distance sum = d1.add(d2);
        System.out.print("Sum of distances: ");
        sum.display();

        System.out.println("Are distances equal? " + d1.isEqual(d2));
    }
}

