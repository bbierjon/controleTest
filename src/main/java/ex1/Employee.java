package ex1;

/**
 * Représente un employé d'une entreprise.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int anneesExperience;
    private Niveau niveau;
    
    /**
     * Enumération des niveaux d'expérience d'un employé.
     */
    public enum Niveau {
        JUNIOR,
        INTERMEDIATE,
        SENIOR
    }

    /**
     * Constructeur de la classe Employee.
     * 
     * @param firstName         le prénom de l'employé
     * @param lastName          le nom de famille de l'employé
     * @param anneesExperience  le nombre d'années d'expérience de l'employé
     * @param niveau            le niveau d'expérience de l'employé
     */
    public Employee(String firstName, String lastName, int anneesExperience, Niveau niveau) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.anneesExperience = anneesExperience;
        this.niveau = niveau;
    }

    /**
     * Retourne le prénom de l'employé.
     * 
     * @return le prénom de l'employé
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Modifie le prénom de l'employé.
     * 
     * @param firstName le nouveau prénom de l'employé
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retourne le nom de famille de l'employé.
     * 
     * @return le nom de famille de l'employé
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Modifie le nom de famille de l'employé.
     * 
     * @param lastName le nouveau nom de famille de l'employé
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retourne le nombre d'années d'expérience de l'employé.
     * 
     * @return le nombre d'années d'expérience de l'employé
     */
    public int getAnneesExperience() {
        return anneesExperience;
    }

    /**
     * Modifie le nombre d'années d'expérience de l'employé.
     * 
     * @param anneesExperience le nouveau nombre d'années d'expérience de l'employé
     */
    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    /**
     * Retourne le niveau d'expérience de l'employé.
     * 
     * @return le niveau d'expérience de l'employé
     */
    public Niveau getNiveau() {
        return niveau;
    }

    /**
     * Modifie le niveau d'expérience de l'employé.
     * 
     * @param niveau le nouveau niveau d'expérience de l'employé
     */
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
}
