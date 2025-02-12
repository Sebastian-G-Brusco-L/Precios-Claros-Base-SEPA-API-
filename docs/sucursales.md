# 📍 API - Sucursales

Esta API proporciona endpoints para gestionar las sucursales de los comercios. 
Permite obtener información detallada de cada sucursal y 
realizar operaciones CRUD.

📌 **Base URL:** `/api/sucursal`

---

## 📌 **Endpoints disponibles**

### 🔍 Obtener una sucursal por ID
- **URL:** `/api/sucursal/{id}`
- **Método:** `GET`
- **Parámetros:**
    - `id` (Integer) → ID de la sucursal
- **Ejemplo de respuesta:**
  ```json
  {
    "idSucursal": 2,
    "idComercio": 3,
    "idBandera": 1,
    "sucursalesNombre": "ACASSUSO",
    "sucursalesTipo": "Autoservicio",
    "sucursalesCalle": "AV. LIBERTADOR",
    "sucursalesNumero": "15301",
    "sucursalesLatitud": "-34.47436",
    "sucursalesLongitud": "-58.50185",
    "sucursalesObservaciones": null,
    "sucursalesBarrio": "Acassuso",
    "sucursalesCodigoPostal": "1641",
    "sucursalesLocalidad": "ACASSUSO",
    "sucursalesProvincia": "AR-B",
    "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
    "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
    "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
    "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
    "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
    "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
    "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
  }
---

### 🔍 Obtener todas las sucursales
- **URL:** `/api/sucursal`
- **Método:** `GET`

- **Ejemplo de respuesta:**
  ```json
  [
  {
    "idSucursal": 3,
        "idComercio": 3,
        "idBandera": 1,
        "sucursalesNombre": "RIVER",
        "sucursalesTipo": "Autoservicio",
        "sucursalesCalle": "AV. F.ALCORTA",
        "sucursalesNumero": "7786",
        "sucursalesLatitud": "-34.546397",
        "sucursalesLongitud": "-58.451884",
        "sucursalesObservaciones": null,
        "sucursalesBarrio": "Belgrano",
        "sucursalesCodigoPostal": "1428",
        "sucursalesLocalidad": "CAPITAL FEDERAL",
        "sucursalesProvincia": "AR-C",
        "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
        "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
        "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
        "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
        "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
        "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
        "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
  },
  .
  .
  ]


---
### 🔍 Obtener sucursales por bandera
- **URL:** `/api/sucursal/bandera/{idBandera}`
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
            "idSucursal": 2,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "ACASSUSO",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. LIBERTADOR",
            "sucursalesNumero": "15301",
            "sucursalesLatitud": "-34.47436",
            "sucursalesLongitud": "-58.50185",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Acassuso",
            "sucursalesCodigoPostal": "1641",
            "sucursalesLocalidad": "ACASSUSO",
            "sucursalesProvincia": "AR-B",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
        },
        {
            "idSucursal": 3,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "RIVER",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. F.ALCORTA",
            "sucursalesNumero": "7786",
            "sucursalesLatitud": "-34.546397",
            "sucursalesLongitud": "-58.451884",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Belgrano",
            "sucursalesCodigoPostal": "1428",
            "sucursalesLocalidad": "CAPITAL FEDERAL",
            "sucursalesProvincia": "AR-C",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
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
    "totalPages": 21,
    "totalElements": 41,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 2,
    "first": true,
    "empty": false
  }

---
### 🔍 Obtener sucursales por comercio
- **URL:** `/api/sucursal/comercio/{idComercio}`
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
            "idSucursal": 2,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "ACASSUSO",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. LIBERTADOR",
            "sucursalesNumero": "15301",
            "sucursalesLatitud": "-34.47436",
            "sucursalesLongitud": "-58.50185",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Acassuso",
            "sucursalesCodigoPostal": "1641",
            "sucursalesLocalidad": "ACASSUSO",
            "sucursalesProvincia": "AR-B",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
        },
        {
            "idSucursal": 3,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "RIVER",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. F.ALCORTA",
            "sucursalesNumero": "7786",
            "sucursalesLatitud": "-34.546397",
            "sucursalesLongitud": "-58.451884",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Belgrano",
            "sucursalesCodigoPostal": "1428",
            "sucursalesLocalidad": "CAPITAL FEDERAL",
            "sucursalesProvincia": "AR-C",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
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
    "totalPages": 21,
    "totalElements": 41,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 2,
    "first": true,
    "empty": false
  }

---
### 🔍 Obtener sucursales por localidad
- **URL:** `/api/sucursal/localidad/{localidad}`
- **Método:** `GET`
- **Parámetros:**
    - `localidad` (String) → Nombre de la localidad
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    {
            "idSucursal": 56,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "OLIVOS",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. LIBERTADOR",
            "sucursalesNumero": "2365",
            "sucursalesLatitud": "-34.50855",
            "sucursalesLongitud": "-58.47972",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Olivos",
            "sucursalesCodigoPostal": "1636",
            "sucursalesLocalidad": "OLIVOS",
            "sucursalesProvincia": "AR-B",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
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
    "last": true,
    "totalPages": 1,
    "totalElements": 1,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
  }


---
### 🔍 Obtener sucursales por barrio
- **URL:** `/api/sucursal/barrio/{barrio}`
- **Método:** `GET`
- **Parámetros:**
    - `barrio` (Integer) → Nombre del barrio
    - `page` (Opcional) → Pagina (default 0)
    - `size` (Opcional) → Tamanio de pagina (default 10)
- **Ejemplo de respuesta:**
  ```json
  {
    "content": [
        {
            "idSucursal": 31,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "CENTENARIO",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. F. ALCORTA",
            "sucursalesNumero": "3099",
            "sucursalesLatitud": "-34.575574",
            "sucursalesLongitud": "-58.397682",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Palermo",
            "sucursalesCodigoPostal": "1425",
            "sucursalesLocalidad": "CAPITAL FEDERAL",
            "sucursalesProvincia": "AR-C",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
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
    "last": true,
    "totalPages": 1,
    "totalElements": 1,
    "size": 2,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 1,
    "first": true,
    "empty": false
  }

---
### ➕ Agregar una sucursal
- **URL:** `/api/sucursal`
- **Método:** `POST`

- **Ejemplo del Body (JSON):**
  ```json
  {
    "idSucursal": 31,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "CENTENARIO",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. F. ALCORTA",
            "sucursalesNumero": "3099",
            "sucursalesLatitud": "-34.575574",
            "sucursalesLongitud": "-58.397682",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Palermo",
            "sucursalesCodigoPostal": "1425",
            "sucursalesLocalidad": "CAPITAL FEDERAL",
            "sucursalesProvincia": "AR-C",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
  }

---
### ✏️ Actualizar una sucursal
- **URL:** `/api/sucursal/{id}`
- **Método:** `PUT`
- **Parámetros:**
    - `id` (Integer) → ID de la sucursal
- **Ejemplo del Body (JSON)**
  ```json
  {
    "idSucursal": 31,
            "idComercio": 3,
            "idBandera": 1,
            "sucursalesNombre": "CENTENARIO",
            "sucursalesTipo": "Autoservicio",
            "sucursalesCalle": "AV. F. ALCORTA",
            "sucursalesNumero": "3099",
            "sucursalesLatitud": "-34.575574",
            "sucursalesLongitud": "-58.397682",
            "sucursalesObservaciones": null,
            "sucursalesBarrio": "Palermo",
            "sucursalesCodigoPostal": "1425",
            "sucursalesLocalidad": "CAPITAL FEDERAL",
            "sucursalesProvincia": "AR-C",
            "sucursalesLunesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMartesHorarioAtencion": "00:00 a 24:00",
            "sucursalesMiercolesHorarioAtencion": "00:00 a 24:00",
            "sucursalesJuevesHorarioAtencion": "00:00 a 24:00",
            "sucursalesViernesHorarioAtencion": "00:00 a 24:00",
            "sucursalesSabadoHorarioAtencion": "00:00 a 24:00",
            "sucursalesDomingoHorarioAtencion": "00:00 a 24:00"
  }


---
### ❌️ Eliminar una sucursal
- **URL:** `/api/sucursal/{id}`
- **Método:** `DELETE`
- **Parámetros:**
    - `id` (Integer) → ID de la sucursal


---
### 🔢️ Obtener el total de las sucursales
- **URL:** `/api/sucursal/count`
- **Método:** `GET`
- **Ejemplo de la respuesta:**
  ```json
  {
    42
  }



