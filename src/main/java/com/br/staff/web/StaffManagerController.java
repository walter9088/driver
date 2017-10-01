package com.br.staff.web;

import com.br.staff.dao.mapper.StaffDaoMapper;
import com.br.staff.dao.mode.StaffDao;
import com.br.staff.dao.mode.StaffJobModeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by walter on 17/9/30.
 */
@RestController
@RequestMapping("/staff")
public class StaffManagerController {

    @Autowired
    private StaffDaoMapper staffDaoMapper;


    @RequestMapping("/add.html")
    public String addStaff(){
        StaffDao dao = new StaffDao();
        dao.setName("test");
        dao.setStatus("入职");
        dao.setBirthDate(new Date());
        dao.setMobile("+86 13967184510");
        dao.setSex("男");
        staffDaoMapper.insert(dao);
        return "add staff successfully!";
    }

}
