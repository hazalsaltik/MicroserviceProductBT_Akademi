package com.bt_akademi.product_management.model.service;


import com.bt_akademi.product_management.model.entity.Product;
import com.bt_akademi.product_management.utility.ExceptionMessageType;
import com.bt_akademi.product_management.utility.Util;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends AbstractProductService
{
    @Override
    protected List<Product> findAllByPriceGreaterThan(Double price)
    {
        return productRepository.findAllByPriceGreaterThan(price);
    }

    @Override
    protected List<Product> findAllByPriceGreaterThanEqual(Double price)
    {
        return productRepository.findAllByPriceGreaterThanEqual(price);
    }

    @Override
    public List<Product> getAll()
    {
        return productRepository.findAll();
    }

    @Override
    public Product findByID(Integer productID)
    {
        return productRepository.findById(productID)
                .orElseThrow(() -> new RuntimeException(ExceptionMessageType.FIND_BY_ID.getValue()));
    }

    @Override
    public Product save(Product entity)
    {
        try
        {
            return productRepository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
        catch (OptimisticLockingFailureException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
    }

    @Override
    public void delete(Integer productID)
    {
        try
        {
            productRepository.deleteById(productID);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
        }
    }
}
