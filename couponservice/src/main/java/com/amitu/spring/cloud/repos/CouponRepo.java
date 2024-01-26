package com.amitu.spring.cloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amitu.spring.cloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
