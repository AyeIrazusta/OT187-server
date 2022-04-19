/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.ong.entity;


import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TESTIMONIALS")
public class Testimonials {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "IdTestimonials", nullable = false)
  private Long Id;

  @Column(name = "nombre", nullable = false)
  private String name;

  @Column(name = "image", nullable = true)
  private String image;

  @Column(name = "content", nullable = true)
  private String content;

  @Column(name = "TIMESTAMP")
  @CreationTimestamp
  private Timestamp timestamp;

  @Column(name = "SOFT_DELETE")
  private boolean softDelete;
}
