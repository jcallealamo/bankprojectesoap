package com.example.bankprojectexamplesoap.jpa;

import java.util.List;

import javax.persistence.Query;

import com.example.bankprojectexamplesoap.entity.FindSucursalBanco;
import com.example.bankprojectexamplesoap.utils.JpaRepository;


public class FindSucursalBancoEntity extends JpaRepository {
	public List<FindSucursalBanco> getPaymentsOrdersByCoin(String idbanco) {
		JpaRepository.setupStatic();
		this.setup();
		Query nativeQuery = em.createNativeQuery(
				"SELECT s.nombre,o.montopago,o.moneda,o.fecharegistro FROM Banco b, Sucursales s "
				+ "WHERE b.idsucursal = s.idsucursal "
				+ "AND b.idbanco = ?");
		nativeQuery.setParameter(1, idbanco);  
		List<FindSucursalBanco> resultado = nativeQuery.getResultList();
		return resultado;
	}

}
