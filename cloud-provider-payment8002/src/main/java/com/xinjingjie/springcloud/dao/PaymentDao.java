package com.xinjingjie.springcloud.dao;

import com.xinjingjie.cloudapicommons.entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentDao {
   @Insert("insert into payment(serial) values (#{serial})")
   public int creat(Payment payment);

   @Select("select * from payment where id=#{id}")
   public Payment getPaymentById(@Param("id") Long id);

}
