public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "Lily", "lily@example.com");
    }
}
