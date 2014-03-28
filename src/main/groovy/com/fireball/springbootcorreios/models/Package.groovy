package com.fireball.springbootcorreios.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

/**
 * Created by carlos on 25/03/14.
 */
@Entity
class Package {

    @Id
    @GeneratedValue
    Long id
    String code
    String description

    @OneToMany(mappedBy = "myPackage")
    List<History> histories = []

    def lastUpdate() {
        histories.sort { -it.date }
        histories.first()
    }

    def delivered() {

        histories.any { "ENTREGUE" == it.status.toUpperCase() }
    }

}
