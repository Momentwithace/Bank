package africa.semicolon.bankApp.service;

import africa.semicolon.bankApp.data.models.Customer;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService{
    @Override
    public int numberOfCustomers() {
        return 0;
    }

    @Override
    public Customer addCustomer(String customer) {
        return null;
    }

    @Override
    public void deleteCustomers(String customer) {

    }

    @Override
    public List<Customer> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return null;
    }

    @Override
    public int findByAccountNumber() {
        return 0;
    }

    @Override
    public float deposit(float amount) {
        return 0;
    }

    @Override
    public float withdraw(float amount) {
        return 0;
    }

    @Override
    public float transfer(float amount) {
        return 0;
    }

    @Override
    public float balance(float amount) {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }
}
