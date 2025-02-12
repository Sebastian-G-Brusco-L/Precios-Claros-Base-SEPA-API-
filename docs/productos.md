# 📍 API - Productos

Esta API proporciona endpoints para gestionar los productos.
Permite obtener información detallada de cada producto, filtrarlos por diferentes cirterios y
realizar operaciones CRUD.

📌 **Base URL:** `/api/producto`

---

## 📌 **Endpoints disponibles**
### 🔍 Obtener un producto por ID
- **URL:** `/api/producto/{idProducto}`
- **Método:** `GET`
- **Parámetros:**
    - `idProducto` (Integer) → ID del producto
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
     "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 76
            },
            "productosDescripcion": "CROQUE MONSIEUR",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 5650.0,
            "productosPrecioReferencia": 5650.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 29,
                "productosEan": "1",
                "idProducto": 76
            },
            "productosDescripcion": "CROQUE MONSIEUR",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 5650.0,
            "productosPrecioReferencia": 5650.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 37,
    "totalPages": 19,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---

### 🔍 Obtener un producto por sucursal
- **URL:** `/api/producto/sucursal/{idSucursal}`
- **Método:** `GET`
- **Parámetros:**
    - `idSucursal` (Integer) → ID de la sucursal
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
     "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7791813434412
            },
            "productosDescripcion": "7UP FREE PET X 1.5L",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 3550.0,
            "productosPrecioReferencia": 3550.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "0",
                "idProducto": 23897
            },
            "productosDescripcion": "AFEITADORA BIC COMFORT  3",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 820.0,
            "productosPrecioReferencia": 820.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 386,
    "totalPages": 193,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---
### 🔍 Obtener un producto por comercio
- **URL:** `/api/producto/comercio/{idComercio}`
- **Método:** `GET`
- **Parámetros:**
    - `idComercio` (Integer) → ID del comercio
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7791813434412
            },
            "productosDescripcion": "7UP FREE PET X 1.5L",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 3550.0,
            "productosPrecioReferencia": 3550.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "0",
                "idProducto": 23897
            },
            "productosDescripcion": "AFEITADORA BIC COMFORT  3",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 820.0,
            "productosPrecioReferencia": 820.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 14272,
    "totalPages": 7136,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---
### 🔍 Obtener un producto por bandera
- **URL:** `/api/producto/bandera/{idBandera}`
- **Método:** `GET`
- **Parámetros:**
    - `idBandera` (Integer) → ID de la bandera
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
     "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7791813434412
            },
            "productosDescripcion": "7UP FREE PET X 1.5L",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 3550.0,
            "productosPrecioReferencia": 3550.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "0",
                "idProducto": 23897
            },
            "productosDescripcion": "AFEITADORA BIC COMFORT  3",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 820.0,
            "productosPrecioReferencia": 820.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 14272,
    "totalPages": 7136,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---
### 🔍 Obtener cantidad de productos
- **URL:** `/api/producto/count`
- **Método:** `GET`
- **Ejemplo de respuesta:**
  ```json
  {
    14272
  }
---
### 🔍 Obtener un producto por ean
- **URL:** `/api/producto/ean/{productoEan}`
- **Método:** `GET`
- **Parámetros:**
    - `productoEan` (Integer) → Codigo EAN del producto
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
     "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7791813434412
            },
            "productosDescripcion": "7UP FREE PET X 1.5L",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 3550.0,
            "productosPrecioReferencia": 3550.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7790580109882
            },
            "productosDescripcion": "AGUILA EXTRAFINO 60% CACAO X 150 GR",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 8750.0,
            "productosPrecioReferencia": 8750.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 11063,
    "totalPages": 5532,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---
### 🔍 Obtener productos por descripcion
- **URL:** `/api/producto/desc/{productosDescripcion}`
- **Método:** `GET`
- **Parámetros:**
    - `productosDescripcion` (String) → Descripcion parcial o total del producto
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7790580109882
            },
            "productosDescripcion": "AGUILA EXTRAFINO 60% CACAO X 150 GR",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 8750.0,
            "productosPrecioReferencia": 8750.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7790040133594
            },
            "productosDescripcion": "AGUILA MINITORTA BROWNIE X 72G",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 1900.0,
            "productosPrecioReferencia": 1900.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 148,
    "totalPages": 74,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---
### 🔍 Obtener productos filtrados por precio de lista entre valores
- **URL:** `/api/producto/between/{min}/{max}`
- **Método:** `GET`
- **Parámetros:**
    - `min` (BigDecimal) → Rango menor del precio
    - `max` (BigDecimal) → Rango mayor del precio
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
     "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "0",
                "idProducto": 23897
            },
            "productosDescripcion": "AFEITADORA BIC COMFORT  3",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 820.0,
            "productosPrecioReferencia": 820.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "0",
                "idProducto": 21586
            },
            "productosDescripcion": "BON-O-BON BOMBON AGUILA X 15G",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 600.0,
            "productosPrecioReferencia": 600.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 1565,
    "totalPages": 783,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }
---
### 🔍 Obtener productos filtrados por precio de lista menor a un valor
- **URL:** `/api/producto/lessthan/{max}`
- **Método:** `GET`
- **Parámetros:**
    - `max` (BigDecimal) → Precio maximo
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7791274196522
            },
            "productosDescripcion": "ALGABO ALCOHOL EN GEL X 300 ML",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 300.0,
            "productosPrecioReferencia": 300.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "0",
                "idProducto": 23293
            },
            "productosDescripcion": "ARCOR OBLEA C/PASTA DE TURRON Y MANI FIBRA 25G",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 140.0,
            "productosPrecioReferencia": 140.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 2466,
    "totalPages": 1233,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }

### 🔍 Ordenar productos por precio de mayor a menor
- **URL:** `/api/producto/sort/precio-lista/desc`
- **Método:** `GET`
- **Parámetros:**
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 3,
                "productosEan": "1",
                "idProducto": 7790580115579
            },
            "productosDescripcion": "COFLER BLOCK CHOCOLATE X 1KG",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 41600.0,
            "productosPrecioReferencia": 41600.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 29,
                "productosEan": "1",
                "idProducto": 7790580115579
            },
            "productosDescripcion": "COFLER BLOCK CHOCOLATE X 1KG",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 41600.0,
            "productosPrecioReferencia": 41600.0,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 14272,
    "totalPages": 7136,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }

### 🔍 Ordenar productos por precio de menor a menor
- **URL:** `/api/producto/sort/precio-lista/asc`
- **Método:** `GET`
- **Parámetros:**
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    "content": [
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 65,
                "productosEan": "1",
                "idProducto": 7790742167101
            },
            "productosDescripcion": "Queso Finlandia Chef Cheddar 150gr PAQUETE INSUMO",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 0.01,
            "productosPrecioReferencia": 0.01,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        },
        {
            "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 66,
                "productosEan": "1",
                "idProducto": 7790742167101
            },
            "productosDescripcion": "Queso Finlandia Chef Cheddar 150gr PAQUETE INSUMO",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 0.01,
            "productosPrecioReferencia": 0.01,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 2,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "last": false,
    "totalElements": 14272,
    "totalPages": 7136,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
  }

---
### ➕ Agregar un producto
- **URL:** `/api/producto`
- **Método:** `POST`

- **Ejemplo del Body (JSON):**
  ```json
  {
     "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 65,
                "productosEan": "1",
                "idProducto": 7790742167101
            },
            "productosDescripcion": "Queso Finlandia Chef Cheddar 150gr PAQUETE INSUMO",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 0.01,
            "productosPrecioReferencia": 0.01,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
  }

---
### ✏️ Actualizar un producto
- **URL:** `/api/producto/{id}`
- **Método:** `PUT`
- **Parámetros:**
    - `id` (Integer) → ID del comercio
- **Ejemplo del Body (JSON)**
  ```json
  {
     "id": {
                "idComercio": 3,
                "idBandera": 1,
                "idSucursal": 65,
                "productosEan": "1",
                "idProducto": 7790742167101
            },
            "productosDescripcion": "Queso Finlandia Chef Cheddar 150gr PAQUETE INSUMO",
            "productosCantidadPresentacion": 1.0,
            "productosUnidadMedidaPresente": null,
            "productosMarca": null,
            "productosPrecioLista": 0.01,
            "productosPrecioReferencia": 0.01,
            "productosCantidadReferencia": 1.0,
            "productosUnidadMedidaReferencia": "unidad",
            "productosPrecioUnitarioPromo1": null,
            "productosLeyendaPromo1": null,
            "productosPrecioUnitarioPromo2": null,
            "productosLeyendaPromo2": null
  }
---
### ❌️ Eliminar un producto
- **URL:** `/api/comercio/{id}`
- **Método:** `DELETE`
- **Parámetros:**
    - `id` (Integer) → ID del comercio
