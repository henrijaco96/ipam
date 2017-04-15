package ues.tareaipam;

public class ClientManager {

    private String cod,name,lastName,type,pay;
    private int id;

    public ClientManager(String Cod, String Name, String LastName, int Id, String Type,String Pay){
        cod=Cod;
        name = Name;
        lastName=LastName;
        id=Id;
        type=Type;
        pay=Pay;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
