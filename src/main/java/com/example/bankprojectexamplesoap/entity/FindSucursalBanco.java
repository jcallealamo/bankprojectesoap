package com.example.bankprojectexamplesoap.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class FindSucursalBanco {
	private String nombreSucursal;
	private String direccionSucursal;
	private String nombreBanco;

}
