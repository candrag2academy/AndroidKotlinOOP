package co.candra.registeractivityapp.model

import java.lang.Boolean.FALSE

data class Nasabah (
    var id: String? = "",
    var nama: String? = "",
    var alamat: String? = "",
    var password: String? = "",
    var token: String? = "",
    var saldo: Double? = 0.0 ,
    var aktif: Boolean = FALSE
) {

    fun resetPassword() {
        password = "12345678"
    }
    fun promo() {
        saldo = saldo?.plus(100000.0)
    }
}