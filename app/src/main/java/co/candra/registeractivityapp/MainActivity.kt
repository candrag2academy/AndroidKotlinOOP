package co.candra.registeractivityapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.candra.registeractivityapp.model.Nasabah
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var nasabah = Nasabah()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickGroup()
    }


    fun onClickGroup() {
        refreshTextView.setOnClickListener {
            namaTextView.text = "Nama : ${nasabah.nama} "
            alamatTextView.text = "Alamat : ${nasabah.alamat} "
            passwordTextView.text = "Password : ${nasabah.password} "
            tokenTextView.text = "Token :${nasabah.token} "
            saldoTextView.text = "Saldo : ${nasabah.saldo.toString() }"
            aktifTextView.text = "Aktif : ${nasabah.aktif.toString() }"
        }
        resetPasswordButton.setOnClickListener {
            nasabah.resetPassword()
        }
        promoButton.setOnClickListener {
            nasabah.promo()
        }
        setNamaButton.setOnClickListener {
            nasabah.nama= namaEditText.text.toString()
        }
        setAlamatButton.setOnClickListener {
            nasabah.alamat=alamatEditText.text.toString()
        }
        setPasswordButton.setOnClickListener {
            nasabah.password=passwordEditText.text.toString()
        }
        setTokenButton.setOnClickListener {
            nasabah.token=tokenEditText.text.toString()
        }
        setSaldoButton.setOnClickListener {
            nasabah.saldo=saldoEditText.text.toString().toDouble()
        }
    }
}
