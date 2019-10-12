package app;

/**
 * Modelo
 */
public class Modelo {

    private String name;
    private String lastName;
    private String eMail;
    private String telephone;

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void seteMail(String eMail){
        this.eMail = eMail;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String geteMail(){
        return this.eMail;
    }

    public String getTelephone(){
        return this.telephone;
    }
}