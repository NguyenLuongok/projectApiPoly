package com.poly.api.service.serviceImpl;

import com.poly.api.dto.DecisionupdateDto;
import com.poly.api.dto.DesiciondetailDto;
import com.poly.api.entities.Desiciondetail;
import com.poly.api.repository.DesiciondetailRepository;
import com.poly.api.service.DesicionDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesiciondetailServiceImpl implements DesicionDetailService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DesiciondetailRepository desiciondetailRepository;


    @Override
    public List<DesiciondetailDto> findAll() {
//        List<Desiciondetail> desiciondetails =
        return null;
    }

    @Override
    public DecisionupdateDto findById(int id) {
        return null;
    }

    @Override
    public DesiciondetailDto save(DesiciondetailDto desiciondetailDto) {
        return null;
    }

    @Override
    public DesiciondetailDto update(DesiciondetailDto desiciondetailDto) {
        return null;
    }
}
