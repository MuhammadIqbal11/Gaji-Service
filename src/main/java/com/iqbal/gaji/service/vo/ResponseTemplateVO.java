/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iqbal.gaji.service.vo;

import com.iqbal.gaji.service.entity.Gaji;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author iqbal
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Gaji gaji;
    private Karyawan karyawan;
    private Golongan golongan; 
}