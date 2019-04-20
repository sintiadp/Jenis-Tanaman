package com.example.jenistanaman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode Grid";

    private ArrayList<String> namaTanaman = new ArrayList<>();
    private ArrayList<String> DeskripsiTanaman = new ArrayList<>();
    private ArrayList<String> GambarTanaman = new ArrayList<>();
    private ArrayList<String> DeskripsiTanamanDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        GambarTanaman.add("https://bibitbunga.com/wp-content/uploads/2018/02/tanaman-palem-kipas-palem-kol-1-1.jpg");
        namaTanaman.add("Palem Kipas");
        DeskripsiTanaman.add("Jenis Tanaman Hias");
        DeskripsiTanamanDetail.add("Palem Kipas merupakan jenis tanaman hias yang banyak di tanam di pekarangan rumah sebagai hiasan sekaligus untuk memepercantik. Tanaman ini merupakan keterpaduan bentuk tanaman palem dan tanaman pisang, namun lebih dekat dengan suku pisang-pisangan. Palem kipas atau Ravenala madagascariensis sonn. berasal dari hutan sekunder Madagascar,  di Indonesia dikenal dengan nama Palem Kipas, sedangkan di dunia Internasional dikenal dengan nama Palem Pelancong, dan termasuk dalam suku Strelitziaceae. Tanaman ini dapat tumbuh pada ketinggian 600 mdpl, tahan terhadap angin kencang, dengan panjang tangkai daun hingga ujung daun mencapai 4 meter , ketinggian pohon rata-rata mencapai 7 meter dengan diameter batang mencapai 20 cm, berbunga sepanjang tahun, berwarna putih dan  berukuran besar, sedangkan buahnya berwarna coklat dengan biji berwarna kebiru-biruan. pada musim kemarau jika pada lipatan daun sudah tidak terdapat sisa air hujan lagi, para pelancong dapat memanfaatkan tangkai daunnya untuk mendapatkan air dengan cara memerasnya, namun air hasil perasan ini perlu disaring dan disuci hamakan terlebih dahulu karena  berwarna hitam dan berbau. Sebutan “Palem Pelancong” dilatarbelakangi oleh para pecinta alam yang menjelajahi hutan Madagascar yang saat itu mengalami kehausan dan kesulitan mendapatkan air minum, yang akhirnya dapat bertahan hidup dengan memanfaatkan air hujan yang tertampung pada lipatan pelepah daun dan dapat diminum secara langsung. Akan tetapi pada musim kemarau jika pada lipatan daun sudah tidak terdapat sisa air hujan lagi, para pelancong dapat memanfaatkan tangkai daunnya untuk mendapatkan air dengan cara memerasnya, namun air hasil perasan ini perlu disaring dan disuci hamakan terlebih dahulu karena  berwarna hitam dan berbau");

        GambarTanaman.add("https://storage.googleapis.com/manfaat/2015/03/daun-kumis-kucing.jpg");
        namaTanaman.add("Kumis Kucing");
        DeskripsiTanaman.add("Jenis Tanaman Obat");
        DeskripsiTanamanDetail.add("Kumis kucing merupakan tanaman obat berupa tumbuhan berbatang basah yang tegak. Tanaman ini dikenal dengan berbagai istilah seperti: kidney tea plants/java tea (Inggris), giri-giri marah (Sumatera), remujung (Jawa Tengah dan Jawa Timur) dan songot koneng (Madura). Tanaman Kumis kucing berasal dari wilayah Afrika tropis, kemudian menyebar ke wilayah Asia dan Australi. Helai daun berbentuk bundar atau lojong, lanset, bundar telur atau belah ketupat yang dimulai dari pangkalnya,[2] ukuran daun panjang 1 – 10 cm dan lebarnya 7.5mm – 1.5 cm. urat daun sepanjang pinggir berbulu tipis atau gundul, dimana kedua permukaan berbintik-bintik karena adanya kelenjar yang jumlahnya sangat banyak, panjang tangkai daun 7 – 29 cm. Ciri khas tanaman ada pada bagian kelopak bunga berkelenjar, urat dan pangkal berbulu pendek dan jarang sedangkan di bagian yang paling atas gundul. Bunga bibir, mahkota yang bersifat terminal yakni berupa tandan yang keluar dari ujung cabang dengan panjang 7–29 cm, dengan ukuran panjang 13 – 27mm, di bagian atas ditutupi oleh bulu pendek berwarna ungu dan kemudian menjadi putih, panjang tabung 10 – 18mm, panjang bibir 4.5 – 10mm, helai bunga tumpul, bundar. Benang sari ukurannya lebih panjang dari tabung bunga dan melebihi bibir bunga bagian atas. Buah geluk berwarna coklat gelap, panjang 1.75 – 2mm. 2.3. gagang berbulu pendek dan jarang, panjang 1 mm sampai 6 mm.");

        GambarTanaman.add("https://1.bp.blogspot.com/-dMtvKXCZ8tQ/WDOovpESNaI/AAAAAAAAC84/S18ww8FI_hkq0n8rjBdcvbL0amyv3FdvgCLcB/s1600/40hss.jpg");
        namaTanaman.add("Selada");
        DeskripsiTanaman.add("Jenis Tanaman Hidroponik");
        DeskripsiTanamanDetail.add("Selada (Lactuca sativa) merupakan  sayuran daun yang tergolong ke dalam  genus Lactuca. Selada ini termasuk tanaman semusim  yang memiliki berbagai bentuk, khususnya bentuk daun. Tanaman ini banyak dibudidayakan petani terutama di daerah dataran tinggi atau sekitar pegunungan. Budidaya selada hidroponik merupakan cara baru dalam teknik penanaman yang dilakukan tanpa media tanah. Teknik ini pada dasarnya hanya memanfaatkan air sebagai media tumbuh tanaman. Sistem Hidroponik menggunakan air lebih efisien, sehingga cocok diterapkan pada daerah yang memiliki pasokan air terbatas.  Jika dibandingkan dengan penanaman secara konvensional, hidroponik lebih dapat memberi keuntungan seperti pemanfaatan lahan sempit, pemeliharaan tanaman yang tergolong mudah dan hasil panen higienis sehingga sayuran yang dipanen lebih bersih dan sehat. Selama ini, selada dimanfaatkan sebagai sayuran daun untuk salad dan disebut-sebut sebagai rajanya salad karena teksturnya yang sangat halus. Daun selada dikonsumsi secara mentah dan dapat ditemukan dalam salad atau hamburger. Penulis sendiri lebih senang mengkonsumsi selada sebagai lalapan teman makan sambal. Selada memiliki beberapa jenis varian, namun yang dikenal secara luas hanya 5 jenis saja. Mereka adalah butterhead (Boston), selada cina, crisphead (Iceberg), looseleaf, Romaine, dan Summer Crisp (Batavia). Selada cocok ditanam untuk dataran rendah - tinggi, daun berbentuk oval keriting, warna daun hijau segar, panen 30 - 40 HST, produksi mencapai 10 sampai 15 ton/ha.");

        GambarTanaman.add("http://www.anekabungahias.com/wp-content/uploads/2018/07/Teknik-Menanam-Tanaman-Bougenville-Yang-Benar.png");
        namaTanaman.add("Bougenville");
        DeskripsiTanaman.add("Jenis Tanaman Bonsai");
        DeskripsiTanamanDetail.add("Bougenville merupakan tanaman hias populer. Bentuknya adalah pohon kecil yang sukar tumbuh tegak. Keindahannya berasal dari seludang bunganya yang berwarna cerah dan menarik perhatian karena tumbuh dengan rimbunnya. Seludang bunga ini kerap dianggap sebagai bagian bunga, walaupun bunganya yang benar adalah bunga kecil yang terlindung oleh seludang. Tanaman bugenvil ini mempunyai bagian tanaman yang berwarna-warni. Oleh karena itu, tanaman bougainvillea menjadi tanaman hias yang sangat populer karena kecantikkan warnanya dan cara merawatnya yang mudah. Berasal dari Amerika Selatan, tanaman ini sering ditanam di taman dan kawasan perumahan. Pada waktu tanaman ini berbunga, tanaman ini mempunyai kebiasaan merontokkan beberapa daunnya. Bentuknya adalah pohon kecil yang sukar tumbuh tegak. (Seludang bunga ( atau spatha) merupakan daun pelindung, yang seringkali berukuran besar, yang menyelubungi seluruh bunga majemuk waktu belum mekar. Seludang bunga dapat dijumpai pada struktur generatif (\"bunga\") tumbuhan anggota suku aren-arenan (Arecaceae dan suku talas-talasan (Araceae). Seludang bunga sebenarnya merupakan suatu bentuk khusus dari daun pelindung (bractea)). Bugenvil disebut tanaman bunga kertas karena bentuk seludang bunganya yang tipis dan mempunyai ciri – ciri seperti kertas. Nama Inggris bunga ini adalah Bougainvillea yang diambil dari nama Sir Louis Antoine de Bougainville, seorang prajurit AL Prancis. Antara jenis pokok bunga kertas tersohor ialah Bougainvillea ‘Elizabeth Angus’; Bougainvillea ‘Red’; Bougainvillea Pultonii; Bougainvillea ‘Easter Parade’ dan Bougainvillea ‘Lady Mary Baring’.");

        GambarTanaman.add("https://www.tamantanaman.com/wp-content/uploads/2016/02/supelir-600x512.jpg");
        namaTanaman.add("Suplir");
        DeskripsiTanaman.add("Jenis Tanaman Paku");
        DeskripsiTanamanDetail.add("Suplir adalah tumbuhan paku populer untuk penghias ruang atau taman yang termasuk dalam marga Adiantum, yang tergolong dalam anaksuku Vittarioideae, suku Pteridaceae . Suplir memperbanyak diri secara generatif dengan spora yang terletak pada bagian tepi sisi bawah daun yang sudah dewasa. Suplir memiliki penampilan yang khas, yang membuatnya mudah dibedakan dari jenis paku-pakuan lain. Daunnya tidak berbentuk memanjang, tetapi cenderung membulat. Spora terlindungi oleh sporangium yang dilindungi oleh indusium. Kumpulan indusia (sorus) berada di sisi bawah daun pada bagian tepi yang agak terlindung oleh lipatan daun. Tangkai entalnya khas karena berwarna hitam dan mengkilap, kadang-kadang bersisik halus ketika dewasa. Sebagaimana paku-pakuan lain, daun tumbuh dari rimpang dalam bentuk melingkar ke dalam (bahasa Jawa: mlungker) seperti tangkai biola (disebut circinate vernation) dan perlahan-lahan membuka. Akarnya serabut dan tumbuh dari rimpang. Suplir tidak memiliki nilai ekonomi penting selain sebagai tanaman hias yang bisa ditanam di dalam ataupun di luar ruang namun tidak tahan penyinaran matahari langsung. Suplir menyukai tanah yang gembur, kaya bahan organik (humus). Pemupukan dengan kadar nitrogen lebih tinggi disukainya. Pembentukan spora memerlukan tambahan fosfor dan kalium. Pemeliharaan suplir sebagai tanaman hias harus memperhatikan penyiraman. Kekeringan yang dialami suplir tidak bisa diperbaiki hanya dengan penyiraman karena daun yang kering tidak bisa pulih. Penanganannya adalah dengan membuang seluruh ental yang kering hingga dekat rizoma dan memberi sedikit media tumbuh tambahan. Dalam waktu beberapa hari tunas baru akan muncul.");

        GambarTanaman.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLZmPrI-8DX-nSMVsRkk0miOvd32-oy87FygzWAUdYNfw2DMOU");
        namaTanaman.add("Ariocarpus");
        DeskripsiTanaman.add("Jenis Tanaman Kaktus");
        DeskripsiTanamanDetail.add("Kaktus ini merupakan salah satu kaktus yang unik, kenapa unik? Karena bisa kaktus terkenal akan duri, tapi kaktus Ariocarpus tidak memiliki duri pada batangnya, selain itu kaktus ini memiliki daun berbentuk prisma, ada yang melengkung, tumpul dan runcing. Kaktus ini juga mempunyai warna yang sangat indah, warna dari bunga kaktus ini beragam ada ungu, pink, putih, kuning dan merah. da idiom yang menyebutkan bahwa ariocarpus melambangkan kemewahan tanaman anggota keluarga Cactaceae. Tinggi kaktus Ariocarpus berdiameter mencapai 25cm-30cm. Tiap tahun kaktus ini bisa bertambah 1cm, jadi umur kaktus ini bisa diperkirakan 30 tahun. Kaktus Ariocarpus mempunyai perawakan seperti batu dan batu adalah habitat aslinya karena hidup diantara bebatuan. Biasanya tepat di tengah kaktus ini ditumbuhi bunga. Ariocarpus sendiri merupakan salah satu jenis dari 8 spesies sukulen, tanaman ini termasuk tanaman subtropis. Nama Ariocarpus sendiri berasal dari bahasa Yunani kuno “aria” jenis suatu oak dan “carpos” yang berarti buah. Karena kemiripan buah dari kedua genus tersebut ketika dalam bentuk biji. Semua spesies Ariocarpus dapat di temukan di Meksiko bagian utara dan pusat, karena memiliki eksposur matahari yang kuat. Anda juga bisa menemukannya di bukit kapur di Rio Grande bagian selatan Texas. Tapi sayang tanaman indah ini sudah terancam punah dan sangat jarang ditemukan di alam bebas. Cara Merawat Kaktus Sesuai dengan habitat aslinya kaktus menyukai sinar matahari di gurun pasir yang panas dan memiliki sirkulasi udara baik. Kaktus tidak suka keadaan tempat yang terlalu lembap, karena daging kaktus itu tebal. Jika terlalu diberi banyak air akan  cepat membusuk dan mati.");

        GambarTanaman.add("https://heruekawahyudi.files.wordpress.com/2014/05/bunga-lily.jpg");
        namaTanaman.add("Bakung Bosnia");
        DeskripsiTanaman.add("Jenis Tanaman Bunga");
        DeskripsiTanamanDetail.add("Tanaman Bakung merupakan bagian dari genus Lilium. Nama tanaman ini dalam bahasa Inggris adalah lily. Ada sekitar 110 suku dalam keluarga bakung (Liliaceae). Kawasan tumbuh bakung meliputi sebagian besar Eropa, sebagian besar Asia sampai Jepang, ke selatan yaitu India, ke Indocina dan ke Filipina. Tanaman ini bisa menyesuaikan diri dengan habitat hutan, seringkali pegunungan, dan kadang-kadang habitat rerumputan. Beberapa mampu hidup di rawa. Pada umumnya tanaman ini lebih cocok tinggal di habitat dengan tanah yang mengandung kadar asam seimbang. Perkembangbiakan Bunga bakung biasanya menggunakan umbi pada perakaranya, Pemecahan umbi lebih baik dilakukan secara langsung jangan sampai terlalu lama hingga mengering. Jika proses penanamanya menunggu waktu lama taruh ditempat yang dingin dan gelap serta lembab. Proses penanaman dilakukan dengan menggali tanah sedalam 15-30 cm lalu tanam umbi dan tutup dengan tanah kembali siram hingga basah, Beri jarak yang sesuai antara 15 - 20 cm. Bakung adalah tumbuhan tahunan dengan tinggi 60–180 cm. Bakung biasanya memiliki tangkai yang kokoh. Kebanyakan suku bakung membentuk umbi polos di bawah tanah. Di beberapa suku Amerika Utara, dasar dari umbi ini berkembang menjadi rizoma. Bunga bakung yang besar memiliki tiga daun bunga, acapkali wangi, dan terdapat dalam berbagai warna dari putih, kuning, jingga, merah muda, merah, ungu, warna tembaga, hingga hampir hitam. Terdapat pula corak berupa bintik-bintik.");



        initRecyclerGrid();

    }


    private void initRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridTanaman adapter = new GridTanaman(this, namaTanaman, GambarTanaman, DeskripsiTanaman, DeskripsiTanamanDetail);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewTanaman adapter = new CardViewTanaman(this, namaTanaman, GambarTanaman, DeskripsiTanaman, DeskripsiTanamanDetail);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                initRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                showRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}