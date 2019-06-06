package System;

import Clinic_package.Doctor;
import DB.EntityObject.ClinicServicelist.LoadClinicServicelist;
import Entity.MedService;

import java.util.ArrayList;

public class ClientService implements IClientService{

    @Override
    public boolean orderProduct(Object object, MedService medService) {
        return false;
    }

    @Override
    public ArrayList<MedService> getPricelist(Object object) {
        ArrayList<MedService> p = new ArrayList<MedService>();
        LoadClinicServicelist loadClinicServicelist =
                new LoadClinicServicelist();

        p = loadClinicServicelist.loadCompanyPricelist();

        return p;
    }

    @Override
    public ArrayList<Doctor> getCompanyInfo(Object object) {
        return null;
    }
}
