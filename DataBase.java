import java.util.*;

public class DataBase
{
    List<Register> register = new ArrayList<>();

    public void DataStorage(Register register)
    {
        this.register.add(register);
        System.out.println(this.register);
    }
}
