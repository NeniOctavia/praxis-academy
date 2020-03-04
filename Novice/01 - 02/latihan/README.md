Pertemuan 2

Latihan :
1. CRC (Cyclic Redundancy Check) adalah algoritme untuk memastikan integritas data dan mengecek kesalahan pada suatu data yang akan ditransmisikan atau disimpan. gambar CRC dapat dibuat di Draw.io secara online. kemudian gambar CRC tersebut akan menjadi acuan untuk mengerjakan kasus nomor 1.

2. - Apa itu Object? sebuah objek adalah bundel perangkat lunak dari status dan perilaku terkait. Objek perangkat lunak sering 
     digunakan untuk memodelkan objek dunia nyata yang Anda temukan dalam kehidupan sehari-hari. 
   
   - Apa itu class ? Kelas adalah cetak biru atau prototipe dari objek yang dibuatt. Bagian ini mendefinisikan kelas yang 
     memodelkan keadaan dan perilaku objek dunia nyata. 
     
   - Apa itu Inheritance? Bagian ini menjelaskan bagaimana kelas menurunkan keadaan dan perilaku dari superclasses mereka, dan 
     menjelaskan cara menurunkan satu kelas dari yang lain menggunakan sintaksis sederhana yang disediakan oleh bahasa pemrograman 
     Java.
     
   - Apa itu Interface? Bagian ini mendefinisikan antarmuka yang sederhana dan menjelaskan perubahan yang diperlukan untuk setiap 
     kelas yang mengimplementasikannya.
     
 3. Packages adalah namespace untuk mengatur kelas dan antarmuka. Menempatkan kode Anda ke dalam paket membuat proyek perangkat 
    lunak lebih mudah dikelola. Bagian ini menjelaskan mengapa ini berguna, dan memperkenalkan Anda ke Application 
    Programming Interface (API) yang disediakan oleh platform Java.

 4. **Bagaimana membuat gradle?
    $ gradle init  --------------> buka terminal di dalam folder yang ingin kalian install gradle, ketik gradle init
    > Task :wrapper

    Select type of project to generate: -----------> setelah itu muncul pilihan seperti dibawah, pilih 2 (Application)
      1: basic
      2: application
      3: library
      4: Gradle plugin
    Enter selection (default: basic) [1..4] 2

    Select implementation language: -----------> setelah itu muncul pilihan seperti dibawah, pilih 3 (Java)
      1: C++
      2: Groovy
      3: Java
      4: Kotlin
      5: Swift
    Enter selection (default: Java) [1..5] 3

    Select build script DSL: -----------> setelah itu muncul pilihan seperti dibawah, pilih 1 (Groovy) / Enter saja
      1: Groovy
      2: Kotlin
    Enter selection (default: Groovy) [1..2] 1

    Select test framework: -----------> setelah itu muncul pilihan seperti dibawah, pilih 4 (JUnit) / Enter saja
      1: JUnit 4
      2: TestNG
      3: Spock
      4: JUnit Jupiter
    Enter selection (default: JUnit 4) [1..4]

    Project name (default: demo): -----------> setelah itu Enter

    Source package (default: demo): -----------> setelah itu Enter


    > Task :init
    Get more help with your project: https://docs.gradle.org/5.4.1/userguide/tutorial_java_projects.html

    BUILD SUCCESSFUL
    2 actionable tasks: 2 executed   -----------> dan Install Berhasil
    
    **Kemudian untuk contoh Run :
    - Masukkan file pada Folder Latihan (Src/Main/Java/latihan) kemudian jangan lupa tambahkan Packages pada file java sesuai 
      dengan nama folder setelah folder JAVA misal file di dalam folder latihan berarti : packages.latihan
    - Kemudian ubah gradle.build sesuai packages dan file java yang akan di run misal : latihan.namafile
    - Kemudian buka terminal posisi pada folder Gradle **ketik : - Gradle Build --> jika sukses ketik selanjutnya
                                                                 - Gradle Run --> jika suskses maka akan muncul output sesuai isi
 
 5. Exceptions adalah peristiwa yang terjadi selama pelaksanaan suatu program yang mengganggu aliran instruksi normal.
 


