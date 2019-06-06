package System;

import Clinic_package.Doctor;
import Entity.MedService;

import java.util.ArrayList;

public interface IClientService {
    public boolean orderProduct(Object object, MedService medService);
    public ArrayList<MedService> getPricelist(Object object);
    public ArrayList<Doctor> getCompanyInfo(Object object);
}
