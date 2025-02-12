# 📍 API - Comercios

Esta API proporciona endpoints para gestionar los comercios.
Permite obtener información detallada de cada comercio y
realizar operaciones CRUD.

📌 **Base URL:** `/api/comercio`

---

## 📌 **Endpoints disponibles**
### 🔍 Obtener un comercio por ID
- **URL:** `/api/comercio/{id}`
- **Método:** `GET`
- **Parámetros:**
    - `id` (Integer) → ID del comercio
- **Ejemplo de respuesta:**
  ```json
  {
    "idComercio": 3,
    "idBandera": 1,
    "comercioCuit": "30516186670",
    "comercioRazonSocial": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaNombre": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaUrl": null,
    "comercioUltimaActualizacion": "2025-02-04T16:00:01-03:00",
    "comercioVersionSepa": 1.0
  }
---

### 🔍 Obtener todos los comercios
- **URL:** `/api/comercio`
- **Método:** `GET`
- **Ejemplo de respuesta:**
  ```json
  [
  {
    "idComercio": 3,
    "idBandera": 1,
    "comercioCuit": "30516186670",
    "comercioRazonSocial": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaNombre": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaUrl": null,
    "comercioUltimaActualizacion": "2025-02-04T16:00:01-03:00",
    "comercioVersionSepa": 1.0
  },
  .
  .
  ]
---

### 🔍 Obtener comercios por bandera
- **URL:** `/api/comercio/bandera/{idBandera}`
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
            "idComercio": 3,
            "idBandera": 1,
            "comercioCuit": "30516186670",
            "comercioRazonSocial": "DEHEZA S.A.I.C.F. e I.",
            "comercioBanderaNombre": "DEHEZA S.A.I.C.F. e I.",
            "comercioBanderaUrl": null,
            "comercioUltimaActualizacion": "2025-02-04T16:00:01-03:00",
            "comercioVersionSepa": 1.0
        }
    ],
    "pageable": {
        "pageNumber": 0,
        "pageSize": 10,
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
    "size": 10,
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

### 🔍 Obtener comercio por cuit
- **URL:** `/api/comercio/cuit/{idCuit}`
- **Método:** `GET`
- **Parámetros:**
    - `iCuit` (Integer) → CUIT del comercio
- **Ejemplo de respuesta:**
  ```json
  {
     "idComercio": 3,
    "idBandera": 1,
    "comercioCuit": "30516186670",
    "comercioRazonSocial": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaNombre": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaUrl": null,
    "comercioUltimaActualizacion": "2025-02-04T16:00:01-03:00",
    "comercioVersionSepa": 1.0
  }

---

### 🔍 Obtener el total de comercios
- **URL:** `/api/comercio/count`
- **Método:** `GET`

- **Ejemplo de respuesta:**
  ```json
  {
    85
  }

---
### ➕ Agregar un comercio
- **URL:** `/api/comercio`
- **Método:** `POST`

- **Ejemplo del Body (JSON):**
  ```json
  {
     "idComercio": 3,
    "idBandera": 1,
    "comercioCuit": "30516186670",
    "comercioRazonSocial": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaNombre": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaUrl": null,
    "comercioUltimaActualizacion": "2025-02-04T16:00:01-03:00",
    "comercioVersionSepa": 1.0
  }

---
### ✏️ Actualizar un comercio
- **URL:** `/api/comercio/{id}`
- **Método:** `PUT`
- **Parámetros:**
    - `id` (Integer) → ID del comercio
- **Ejemplo del Body (JSON)**
  ```json
  {
     "idComercio": 3,
    "idBandera": 1,
    "comercioCuit": "30516186670",
    "comercioRazonSocial": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaNombre": "DEHEZA S.A.I.C.F. e I.",
    "comercioBanderaUrl": null,
    "comercioUltimaActualizacion": "2025-02-04T16:00:01-03:00",
    "comercioVersionSepa": 1.0
  }


---
### ❌️ Eliminar un comercio
- **URL:** `/api/comercio/{id}`
- **Método:** `DELETE`
- **Parámetros:**
    - `id` (Integer) → ID del comercio

