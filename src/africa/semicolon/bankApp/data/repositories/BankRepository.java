package africa.semicolon.bankApp.data.repositories;

import africa.semicolon.bankApp.data.models.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<Bank,Integer> {

}
