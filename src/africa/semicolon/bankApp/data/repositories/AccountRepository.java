package africa.semicolon.bankApp.data.repositories;

import africa.semicolon.bankApp.data.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String>{
}
