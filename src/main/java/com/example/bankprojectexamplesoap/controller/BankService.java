package com.example.bankprojectexamplesoap.controller;

import java.util.List;

import javax.jws.*;

import com.example.bankprojectexamplesoap.entity.FindSucursalBanco;
import com.example.bankprojectexamplesoap.jpa.FindSucursalBancoEntity;

@WebService(serviceName = "BankService", targetNamespace = "http://xmlns.bankservice.com/services/v1/BankService")
public class BankService {
	
    @WebMethod
    public List<FindSucursalBanco> getEmployeeList(@WebParam(name = "idbanco") String idbanco){
    	FindSucursalBancoEntity findSucursalBancoEntity = new FindSucursalBancoEntity();
        return findSucursalBancoEntity.getPaymentsOrdersByCoin(idbanco) ;
    }

}
