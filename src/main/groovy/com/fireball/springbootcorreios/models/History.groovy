package com.fireball.springbootcorreios.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Created by carlos on 25/03/14.
 */
@Entity
class History {

    @Id
    @GeneratedValue
    Long id
    Date date
    String location
    String status

    @ManyToOne
    Package myPackage

}
