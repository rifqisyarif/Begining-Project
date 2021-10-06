package com.example.myapplication

import AdapterRecyclerView
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val datasGambar = arrayOf("https://www.google.com/imgres?imgurl=https%3A%2F%2Fds393qgzrxwzn.cloudfront.net%2Fresize%2Fm500x500%2Fcat1%2Fimg%2Fimages%2F0%2FW4XMxSTwLd.jpg&imgrefurl=https%3A%2F%2Fbp-guide.id%2FAXSmHJWn&tbnid=TJ_TXH4KabWJfM&vet=12ahUKEwjAru2n7rTzAhXLhksFHfc_C-0QMygKegUIARDJAQ..i&docid=gDbfi-k-cyHEoM&w=500&h=383&q=baju%20naruto&ved=2ahUKEwjAru2n7rTzAhXLhksFHfc_C-0QMygKegUIARDJAQ",
            "https://www.google.com/imgres?imgurl=https%3A%2F%2Flookaside.fbsbx.com%2Flookaside%2Fcrawler%2Fmedia%2F%3Fmedia_id%3D451207115047557&imgrefurl=https%3A%2F%2Fwww.facebook.com%2Fpages%2Fcategory%2FLocal-Business%2FJual-Baju-Cospley-Naruto-451207115047557%2F&tbnid=kFjpUOGikAsJoM&vet=12ahUKEwjAru2n7rTzAhXLhksFHfc_C-0QMygPegUIARDUAQ..i&docid=eax5IIHK3NtcnM&w=720&h=473&q=baju%20naruto&ved=2ahUKEwjAru2n7rTzAhXLhksFHfc_C-0QMygPegUIARDUAQ")
        val datasJudul = arrayOf("baju naruto anak", "baju naruto asli jepang")
        val datasBuyer = arrayOf("30.000","100.000")
        var rvItem : RecyclerView = findViewById(R.id.rv_item)
        rvItem.adapter = AdapterRecyclerView(this, datasGambar,datasJudul,datasBuyer)
        rvItem.layoutManager = LinearLayoutManager(this)
        rvItem.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.bahasa -> {
                Toast.makeText(this, "Pengaturan Bahasa", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.tampilan -> {
                Toast.makeText(this, "Pengaturan Tampilan", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logout -> {
                startActivity(Intent(this, LoginActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    override fun onStart(){
        super.onStart()
        Toast.makeText(this, "OnStart terpanggil", Toast.LENGTH_SHORT).show()
    }
    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "OnResume terpanggil", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart(){
        super.onRestart()
        Toast.makeText(this, "OnRestart terpanggil", Toast.LENGTH_SHORT).show()
    }
    override fun onStop(){
        super.onStop()
        Toast.makeText(this, "OnStop terpanggil", Toast.LENGTH_SHORT).show()
    }
    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "OnPause terpanggil", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "OnDestroy terpanggil", Toast.LENGTH_SHORT).show()
    }
}