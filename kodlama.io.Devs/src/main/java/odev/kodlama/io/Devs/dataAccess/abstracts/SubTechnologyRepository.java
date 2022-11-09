package odev.kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import odev.kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology,Integer> {

}
