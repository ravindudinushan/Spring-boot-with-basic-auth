package lk.ijse.gdse66.springbootwithbasicauth.repository;

import lk.ijse.gdse66.springbootwithbasicauth.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {
}
