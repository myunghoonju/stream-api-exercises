package space.gavinklfong.demo.streamapi.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import space.gavinklfong.demo.streamapi.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}
