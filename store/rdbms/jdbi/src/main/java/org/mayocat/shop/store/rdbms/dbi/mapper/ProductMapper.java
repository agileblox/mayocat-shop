package org.mayocat.shop.store.rdbms.dbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.mayocat.shop.model.Product;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class ProductMapper implements ResultSetMapper<Product>
{
    @Override
    public Product map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException
    {
        Product product = new Product(resultSet.getLong("id"));
        product.setSlug(resultSet.getString("slug"));
        product.setTitle(resultSet.getString("title"));
        product.setDescription(resultSet.getString("description"));
        product.setOnShelf(resultSet.getBoolean("on_shelf"));

        return product;
    }
}
