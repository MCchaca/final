package final_8;
class Automobile {
    private String make;
    private String model;
    private String trim;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {}

    public Automobile(String make, String model, String trim, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String[] getInfo() {
        try {
            return new String[]{make, model, trim, color, String.valueOf(year), String.valueOf(mileage)};
        } catch (Exception e) {
            return new String[]{"Error: " + e.getMessage()};
        }
    }

    public String remove() {
        try {
            make = model = trim = color = "";
            year = mileage = 0;
            return "Vehicle removed.";
        } catch (Exception e) {
            return "Failed to remove vehicle.";
        }
    }

    public String add(String make, String model, String trim, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.trim = trim;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added.";
        } catch (Exception e) {
            return "Failed to add vehicle.";
        }
    }

    public String update(String make, String model, String trim, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.trim = trim;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated.";
        } catch (Exception e) {
            return "Failed to update vehicle.";
        }
    }
}
