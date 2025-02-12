package com.sebrus.precios_sepa.exceptions;

import com.sebrus.precios_sepa.comercio.ComercioNotFoundException;
import com.sebrus.precios_sepa.productos.ProductoNotFoundException;
import com.sebrus.precios_sepa.sucursal.SucursalNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ComercioNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleComercioNotFoundException(ComercioNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(SucursalNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSucursalNotFoundException(SucursalNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(ProductoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleProductoNotFoundException(ProductoNotFoundException ex) {
        return ex.getMessage();
    }

    //BadRequestException
    //MethodArgumentNotValidException
    //AccessDeniedException
    //UnauthorizedException
    //HttpMessageNotReadableException
    //TimeoutException
    //IllegalArgumentException


}
