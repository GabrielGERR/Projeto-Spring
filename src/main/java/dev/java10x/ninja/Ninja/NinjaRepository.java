package dev.java10x.ninja.Ninja;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<ninjaModel, Long> {
}
