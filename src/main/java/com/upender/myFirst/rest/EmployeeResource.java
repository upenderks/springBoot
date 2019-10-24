package com.upender.myFirst.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upender.myFirst.DTO.EmployeeDTO;
 
@RestController
public class EmployeeResource
{
   @RequestMapping("/")
    public List<EmployeeDTO> getEmployees()
    {
      List<EmployeeDTO> employeesList = new ArrayList<EmployeeDTO>();
      employeesList.add(new EmployeeDTO(1,"Upender","sharma","upender@upender.com"));
      return employeesList;
    }
}