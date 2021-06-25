Feature: Verificacion de aplicación levantada

    Scenario: La aplicacion devuelve el punto de interes mas cercano dadas ciertas coordenadas
        Given la aplicacion está levantada
        And El usuario se encuentra en la latitud "40.74858271884297" y longitud "73.9856644020032"
        And Existe un punto de interes en la latitud "40.74784606929049" y longitud "-73.98693581853294"
        When el cliente hace un GET a "/obtenerPOI"
        Then recibe la respuesta con codigo de estado 200 y contenido
        """
        {"latitud":40.74784606929049,"longitud":-73.98693581853294,"nombre":"Turntable LP Bar & Karaoke","descripcion":"Korean fried chicken, global plates & cocktails fuel patrons enjoying LP tunes & karaoke singers."}
        """

