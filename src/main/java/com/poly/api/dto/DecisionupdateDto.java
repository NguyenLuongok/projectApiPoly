package com.poly.api.dto;

import com.poly.api.entities.Desiciondetail;
import lombok.Data;
/**
 * @author Tong Duy Hai on 05/24/2020.
 * @created 24/05/2020
 * @project PolyProjectApi
 */
@Data
public class DecisionupdateDto {
    private int decisionUpdateId;
    private String namePdf;
    private int desiciondetailId;

    public DecisionupdateDto() {
    }
}
