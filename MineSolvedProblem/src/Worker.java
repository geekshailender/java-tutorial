public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    Worker(String name, String endDate) {
        this.name = name;
        this.endDate = endDate;
    }

    public int getAge() {
        int currentYear = 2026;
        return currentYear - Integer.parseInt(birthDate.substring(0, 4));
    }
    public String getAge(int age) {
        int currentYear = 2026;
        if (age > currentYear) {
            return age + " years old";
        }
        return age + " years old";
    }

    public double collectPay(){
        return Double.parseDouble(birthDate.substring(4, 6));
    }


    public void terminate(String endDate){

    }
}
