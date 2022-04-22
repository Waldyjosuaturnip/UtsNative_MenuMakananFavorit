package com.example.utsnative_menumakananfavorit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MakananList = listOf<makanan>(
            makanan(
                R.drawable.rendang,
                "Rendang",
                " Rendang merupakan menu makanan favorit banyak orang. Bahkan rendang sempat menempati urutan pertama dalam daftar World’s 50 Most Delicious Food oleh CNN pada tahun 2011 yang lalu."
            ),
            makanan(
                R.drawable.rawon,
                "Rawon Surabaya",
                " Rawon merupakan makanan khas orang Surabaya di Jawa Timur. Olahan daging yang konon merupakan makanan favorit raja-raja pada masa lalu ini memiliki kuah berwarna hitam. Warna hitam tersebut berasal dari buah kluwak."
            ),
            makanan(
                R.drawable.gulai,
                "Gulai",
                " Ide menu masakan sehari hari selanjutnya adalah gulai, gulai merupakan menu makanan yang menjadi ciri khas di pulau Jawa dan Sumatera. Gulai merupakan makanan dengan kuah yang terbuat dari bumbu rempah yang memiliki cita rasa gurih."
            ),
            makanan(
                R.drawable.perkedel,
                "Perkedel",
                " Membuat perkedel memang membutuhkan waktu yang cukup lama. Pasalnya menu masakan sehari hari yang terbuat dari kentang ini membutuhkan waktu lama untuk menggoreng kentang terlebih dahulu, sebelum dihancurkan dan dicampurkan dengan telur dan bumbu lainnya."
            ),
            makanan(
                R.drawable.bihungoreng,
                "Bihun Goreng",
                " Bihun goreng merupakan menu yang umum kita temui di setiap penjual nasi goreng. Karena memang menjadikan bihun goreng sebagai menu masakan sehari hari adalah hal yang mudah dan juga enak. Selain itu, bihun goreng juga sangat murah membeli bahan-bahannya."
            ),
            makanan(
                R.drawable.kambingpanggang,
                "Kambing Panggang",
                " Kambing panggang merupakan ide masakan yang akan membuat orang rumah bergairah untuk makan. Kita hanya perlu mengoleskan bumbu pada permukaan kambing hingga rata, kemudian panggang dalam suhu 200 derajat Celcius hingga matang, atau panggang selama kurang lebih sekitar 45 menit."
            ),
            makanan(
                R.drawable.bebekgoreng,
                "Bebek Goreng",
                " Jika bosan dengan olahan ayam, Sedulur bisa mencoba memasak bebek goreng sebagai menu makanan sehari-hari. Daging dari bebek terkenal kenyal dan memiliki rasa yang gurih. Hal tersebut sangat cocok bagi yang menginginkan rasam yang puas saat makan."
            ),
            makanan(
                R.drawable.kepitingpedas,
                "Kepiting Pedas",
                " Jika sekali-kali ingin menjadikan kepiting sebagai menu masakan sehari hari tidak ada salahnya. Walaupun memang bahan yang dibutuhkan sangat sulit didapat. Kepiting merupakan makanan laut yang agar ribet memakannya."
            ),
            makanan(
                R.drawable.soto,
                "Soto Lamongan",
                " Soto Lamongan biasanya dinikmati dengan sepiring nasi hangat dan juga kerupuk udang yang menambah kelezatan saat menikmati olahan kuliner satu ini. Oleh karena itu, makanan satu ini menjadi makanan kebanggan masyarakat Jawa Timur."
            ),
            makanan(
                R.drawable.tengkleng,
                "Tengkleng",
                " Tengkleng merupakan makanan khas Solo. Olahan daging ini mirip seperti gulai kambing, namun memiliki kuah yang lebih encer. Tengkleng merupakan hidangan yang terdiri dari tulang, daging serta jeroan kambing dengan kuah santan beraroma rempah yang memikat."
            ),


            )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakananAdapter(this, MakananList){
            val intent = Intent(this,DetailMakananActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}