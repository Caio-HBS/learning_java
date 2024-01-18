public abstract class YamahaProduct {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void useProduct() {
        switch (type) {
            case "vehicle" -> System.out.println(getName() + ":" + "\n\tReally? That's the most boring option...");
            case "personalWatercraft" ->
                    System.out.println(getName() + ":" + "\n\tYou feel the water droplets in your face as the waves make you jump.");
            case "musicalInstrument" ->
                    System.out.println(getName() + ":" + "\n\tDo you have what it takes to be the next Beethoven?");
            default -> System.out.println("\nSorry, something went wrong :(");
        }
    }

}
