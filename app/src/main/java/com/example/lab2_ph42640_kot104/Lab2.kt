package com.example.lab2_ph42640_kot104

fun main(){

    var s : String?
    do {
        // Khai báo và sử dụng kĩ thuật safety

        var mssv : String? = null
        // var tenSV : String = null // Biến muốn gán giá trị null thì phải có dấu hỏi chấm
        println("Nhập mssv muốn tìm : ")
        s = readLine()
        mssv = s.toString()

        val tenSV = getTensv(mssv!!) // thêm 2 dấu !! để loại bỏ null
        println("Sinh vien co mssv là $mssv co ten :$tenSV ")
        print("Ban muon tim tiep khong(c/k):")

        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}

val danhSachSV : Map<String, String> = mutableMapOf( "PH42640" to "Phạm Minh Hiếu","PH42333" to "Pham Kieu Trinh","PH42693" to "Lê Đăng Sang")
fun getTensv(mssv : String) : String? {
    val tenSV = danhSachSV.get(mssv)
    if (tenSV == null) println("Không tìm thấy tên sinh viên")
    return tenSV
}