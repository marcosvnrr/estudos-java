package entities;

public class Aluguel {
    private String name;
    private String email;

    public Aluguel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail()
    {
        return email;
    }
}
