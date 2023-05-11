package com.example.CrudSpringBoot.interfaces;

import com.example.CrudSpringBoot.modelo.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProdcuto extends CrudRepository<Producto, Integer> {
}
