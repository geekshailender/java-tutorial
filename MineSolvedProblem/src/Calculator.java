public  class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalPrice() {
        return carpet.getCost() * floor.getArea();
    }
}
