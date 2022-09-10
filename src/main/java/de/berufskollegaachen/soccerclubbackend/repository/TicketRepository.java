package de.berufskollegaachen.soccerclubbackend.repository;

import de.berufskollegaachen.soccerclubbackend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

    List<Ticket> findAllByGameId(Integer gameId);
}