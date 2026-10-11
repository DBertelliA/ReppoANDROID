package com.example.srodenas.simulacioncrud.Data

import com.example.srodenas.simulacioncrud.Logic.Client


class ClientsRepo {
    companion object { //Solo se puede poner una vez por clase y equicale a un static de objetos de rapido acceso
        var primaryId = 1;

        val listaCLientes : List<Client> = listOf(
            Client(ClientsRepo.autoIncrement(), "patata", "Caliente", "123456789"),
            Client(ClientsRepo.autoIncrement(), "cebollas", "Caramelizada", "987654321"),
            Client(ClientsRepo.autoIncrement(), "ajos", "Ricos", "213456879")
        )

        fun autoIncrement() : Int = primaryId++
    }

}