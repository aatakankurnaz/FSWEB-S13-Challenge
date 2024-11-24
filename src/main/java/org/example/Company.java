package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro değeri negatif olamaz.");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    public String addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            return "Geçersiz index!";
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
            return "Çalışan eklendi.";
        } else {
            return "Bu index zaten dolu!";
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company{id=").append(id).append(", name='").append(name).append("', giro=").append(giro).append(", developerNames=");
        if (developerNames != null) {
            for (String developer : developerNames) {
                sb.append(developer).append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

