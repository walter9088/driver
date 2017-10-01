package com.br.staff.dao.mapper;

import com.br.staff.dao.mode.StaffDao;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by walter on 17/9/30.
 */
/**
 * CREATE TABLE `test`.`t_staff` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(45) NOT NULL,
 `sex` VARCHAR(12) NULL,
 `birth_date` DATE NULL,
 `mobile` VARCHAR(16) NOT NULL,
 `email` VARCHAR(32) NULL,
 `status` VARCHAR(8) NULL,
 `gmt_create` VARCHAR(45) NULL,
 `gmt_modify` VARCHAR(45) NULL,
 PRIMARY KEY (`id`));*/
@Mapper
public interface StaffDaoMapper {


    String INSTER_DNATESTING_ORDER="insert into t_staff(name,sex,birth_date," +
            "mobile,email,status,gmt_create,gmt_modify) " +
            "values(#{name},#{sex},#{birthDate},#{mobile},#{email}," +
            "#{status},#{gmt_create},#{gmt_modify})";

    String SELECT_staff="select name,sex,birth_date,mobile,email,status,gmt_create,gmt_modify " +
            "from t_staff where id=#{0}";

    String SELECT_DNATESTING_ORDER_BY_ORDERID="select id, trade_id, order_id,receiver_address,receiver_name,receiver_mobile,assay_name," +
            "assay_name,assay_mobile,assay_card,status,gmt_create,gmt_modify from t_dantesting_order where order_id in (#{0})";


    /** 新获取order */
    @Insert(INSTER_DNATESTING_ORDER)
    public int insert(StaffDao staffDao);


    @Select(SELECT_staff)
    @Results({@Result(property = "id",column="id"),@Result(property = "name",column="name"),@Result(property = "sex",column="sex"),
            @Result(property = "birthDate",column = "birth_date"),@Result(property = "mobile",column = "mobile"),
            @Result(property = "email",column = "email"), @Result(property = "status",column="status")})
    public List<StaffDao> getStaffById(int id);



}
