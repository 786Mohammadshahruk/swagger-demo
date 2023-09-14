package com.swagger.dao;


import com.swagger.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String name);

    List<User> findByPriceGreaterThan(BigDecimal price);

    //JPQL
    @Query(value = "SELECT u From User u WHERE u.mobileNumber = :mobileNumber")
    List<User> findByMobileNumber(@Param("mobileNumber") String number);

    //NativeQuery
    @Query(value = "SELECT * From user_table WHERE mobile_number = :mobileNumber", nativeQuery = true)
    List<User> getByMobileNumber(@Param("mobileNumber") String number);

    @Query(value = "SELECT * From user_table WHERE mobile_number = :mobileNumber AND id = :id AND address= :address ", nativeQuery = true)
    List<User> findByMobileIdNumberWithNative(@Param("id")long id,
                                              @Param("mobileNumber") String mobileNumber,
                                              @Param("address") String address);
}
