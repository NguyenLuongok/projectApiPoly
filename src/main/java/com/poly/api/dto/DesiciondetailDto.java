package com.poly.api.dto;

import com.poly.api.entities.Desicion;
import com.poly.api.entities.Student;
import lombok.Data;

/**
 * @author Tong Duy Hai on 05/24/2020.
 * @created 24/05/2020
 * @project PolyProjectApi
 */
@Data
public class DesiciondetailDto {
    private int decisionDetailId;
    private String folderDesicion;
    private Desicion desicion;
    private int studentId;

    public DesiciondetailDto() {
    }

    public DesiciondetailDto(int decisionDetailId, String folderDesicion, Desicion desicion, int student) {
        this.decisionDetailId = decisionDetailId;
        this.folderDesicion = folderDesicion;
        this.desicion = desicion;
        this.studentId = student;
    }

    public DesiciondetailDto(String folderDesicion, Desicion desicion, int student) {
        this.folderDesicion = folderDesicion;
        this.desicion = desicion;
        this.studentId = student;
    }
}
