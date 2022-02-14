package citizens;

public class SelfEmployee extends Citizen {
    private String flag;

    public SelfEmployee(String flag) {
        this.flag = flag;

        if(flag == "#se"){
            setTax(0.30);
        }
    }
}
