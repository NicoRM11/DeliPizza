package com.mendoza.delipizza.models.entity;

import com.mendoza.delipizza.utils.PaymentMethodEnum;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity(name = "ORDER")
@Data
@SQLDelete(sql = "UPDATE order SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Order extends Menu{

    private Long send;
    private Long amount;
    private PaymentMethodEnum paymentMethod;
    private String address;
    private String comments;
    private Long quantity;

    private Timestamp orderCreation;

    private Timestamp orderFinish;

    private boolean deleted = Boolean.FALSE;

}
