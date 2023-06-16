package ex1;

/**
 * Classe qui permet de gèrer les employés d'une entreprise.
 */
public class EmployeeManager {
	
    /**
     * Calcule le salaire d'un employé en fonction de son niveau et de son ancienneté.
     * 
     * @param employee l'employé pour lequel calculer le salaire
     * @return le salaire calculé de l'employé
     * @throws IllegalArgumentException si le niveau de l'employé est incorrect
     */
    public double calculateSalary(Employee employee) {
        double baseSalary;
        switch (employee.getNiveau()) {
            case JUNIOR:
                baseSalary = 20000;
                break;
            case INTERMEDIATE:
                baseSalary = 40000;
                break;
            case SENIOR:
                baseSalary = 60000;
                break;
            default:
                throw new IllegalArgumentException("Niveau incorrect");
        }

        double experienceMultiplier = calculateExperienceMultiplier(employee.getAnneesExperience());
        return baseSalary * experienceMultiplier;
    }

    /**
     * Calcule le coefficient d'ancienneté en fonction des années d'expérience.
     * Le coefficient d'ancienneté augmente de 5% par année d'expérience.
     * 
     * @param anneesExperience le nombre d'années d'expérience de l'employé
     * @return le coefficient d'ancienneté calculé
     */
    public double calculateExperienceMultiplier(int anneesExperience) {
        double multiplier = 1.0 + (anneesExperience * 0.05);
        return multiplier;
    }
}
