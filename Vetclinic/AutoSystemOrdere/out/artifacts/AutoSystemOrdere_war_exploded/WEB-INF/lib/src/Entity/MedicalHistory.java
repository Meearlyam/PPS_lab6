package Entity;

import java.lang.reflect.Array;
import java.util.Date;

public class MedicalHistory {

    private int number;
    private Date registrationDate;
    private int patiantID;
    private int clientID;
    private int doctorID;
    private String medService;
    static int lastNumber = 0;

    public MedicalHistory(Date registrationDate, int clientID, int patiantID, int doctorID, String medService) {
        this.registrationDate = registrationDate;
        this.medService = medService;
        this.number = lastNumber + 1;
        lastNumber = lastNumber + 1;
        this.clientID = clientID;
        this.patiantID = patiantID;
        this.doctorID = doctorID;
    }

    public void addMedService(String ms) {
        this.medService += "\n\n" + ms;
    }
}
