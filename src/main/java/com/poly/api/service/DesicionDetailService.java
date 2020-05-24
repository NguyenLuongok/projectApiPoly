package com.poly.api.service;

import com.poly.api.dto.DecisionupdateDto;
import com.poly.api.dto.DesiciondetailDto;
import com.poly.api.entities.Desiciondetail;

import java.util.List;

public interface DesicionDetailService {

    List<DesiciondetailDto> findAll();

    DecisionupdateDto findById(int id);

    DesiciondetailDto save(DesiciondetailDto desiciondetailDto);

    DesiciondetailDto update(DesiciondetailDto desiciondetailDto);
}
