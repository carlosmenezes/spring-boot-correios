package com.fireball.springbootcorreios.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Transient

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

    @Transient
    List<History> histories = []

    def lastUpdate() {
        histories.sort { -it.date }
        histories.first()
    }

}
