public class Spencer <T extends Transport>{

        private final String name;
        private final int amount;

    public Spencer(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void toSpencerRace () {
        System.out.printf ("Спонсор \" %s \" проспонсировал заезд на %d%n", name,amount);
    }
}

