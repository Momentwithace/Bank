package africa.semicolon.bankApp.service;

import africa.semicolon.bankApp.data.models.Customer;

import java.util.List;

public interface CustomerService {
    int numberOfCustomers();
    Customer addCustomer(String customer);
    void deleteCustomers(String customer);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    int findByAccountNumber();
    float deposit(float amount);
    float withdraw(float amount);
    float transfer(float amount);
    float balance(float amount);
    int count();

}
