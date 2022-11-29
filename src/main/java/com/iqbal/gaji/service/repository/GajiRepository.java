/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iqbal.gaji.service.repository;

import com.iqbal.gaji.service.entity.Gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iqbal
 */
@Repository
public interface GajiRepository extends JpaRepository<Gaji, Long>{
    public Gaji findByGajiId(Long gajiId);
}