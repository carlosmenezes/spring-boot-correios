package com.fireball.springbootcorreios.repositories

import com.fireball.springbootcorreios.models.Package
import org.springframework.data.repository.CrudRepository

/**
 * Created by carlos on 26/03/14.
 */
interface PackageRepository extends CrudRepository<Package, Long> {
}
