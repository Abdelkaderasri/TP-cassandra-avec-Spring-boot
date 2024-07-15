package org.enset.tpcassandraavecspringboot.Repositories;

import org.enset.tpcassandraavecspringboot.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product, String> {
}
