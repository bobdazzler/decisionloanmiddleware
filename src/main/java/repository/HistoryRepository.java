package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.History;

public interface HistoryRepository extends JpaRepository<History,Long>{

}
