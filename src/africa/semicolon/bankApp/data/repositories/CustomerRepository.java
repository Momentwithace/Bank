package africa.semicolon.bankApp.data.repositories;

import africa.semicolon.bankApp.data.models.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer addCustomer(Customer customer);
    float deposit(float amount);
    float withdraw(float amount);
    float balance(float amount);
    float transfer(float amount);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByAccountNumber(int accountNumber);
    List<Customer> findAll();
    int count();
}
