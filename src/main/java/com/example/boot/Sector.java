package com.example.boot;


public class Sector {
   private Long id;
   private String personality;
   private String energy;
   private String  interest;
   private String  health;
   private String  logic;
   private String  labour;
   private String  luck;
   private String  debt;
   private String  memory;

    public Sector(Long id, String personality, String energy, String interest, String health, String logic, String labour, String luck, String debt, String memory) {
        this.id = id;
        this.personality = personality;
        this.energy = energy;
        this.interest = interest;
        this.health = health;
        this.logic = logic;
        this.labour = labour;
        this.luck = luck;
        this.debt = debt;
        this.memory = memory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public String getLabour() {
        return labour;
    }

    public void setLabour(String labour) {
        this.labour = labour;
    }

    public String getLuck() {
        return luck;
    }

    public void setLuck(String luck) {
        this.luck = luck;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "sectorDb{" +
                "id=" + id +
                ", personality='" + personality + '\'' +
                ", energy='" + energy + '\'' +
                ", interest='" + interest + '\'' +
                ", health='" + health + '\'' +
                ", logic='" + logic + '\'' +
                ", labour='" + labour + '\'' +
                ", luck='" + luck + '\'' +
                ", debt='" + debt + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
