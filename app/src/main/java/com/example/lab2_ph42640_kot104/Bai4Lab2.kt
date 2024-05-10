package com.example.lab2_ph42640_kot104

fun main() {
    val sv1 = SinhVienModel("Pham Minh Hieu", "PH42640", 8.8f)
    val sv2 = SinhVienModel("Pham Dang Sang", "PH22222", 8f)
    sv2.tuoi = 22
    sv2.daTotNghiep = true
    val sv3 = SinhVienModel("Pham Kieu Trinh", "PH33333", 6f, false, 22)
    val listSV = mutableListOf<SinhVienModel>()

    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    for (i in listSV.indices) {
        println("SV thu ${i + 1} co thong tin: \n ${listSV[i].getThongTin()} ")
    }

    addSinhVien(listSV)

    println("Danh sách sau khi thêm:")
    for (i in listSV.indices) {
        println("SV thu ${i + 1} co thong tin: \n ${listSV[i].getThongTin()} ")
    }
    xoaSinhVien(listSV)
    println("Danh sách sau khi xóa:")
    for (i in listSV.indices) {
        println("SV thu ${i + 1} có thông tin: \n ${listSV[i].getThongTin()} ")
    }
}

fun addSinhVien(listSV: MutableList<SinhVienModel>) {
    println("Nhập thông tin sinh viên mới:")
    print("Tên sinh viên: ")
    val tenSV = readLine()
    print("Mã số sinh viên: ")
    val mssv = readLine()
    print("Điểm trung bình: ")
    val diemTB = readLine()?.toFloatOrNull()
    print("Đã tốt nghiệp (true/false): ")
    val daTotNghiep = readLine()?.toBoolean()
    print("Tuổi: ")
    val tuoi = readLine()?.toIntOrNull()

    if (tenSV != null && mssv != null && diemTB != null && daTotNghiep != null && tuoi != null) {
        if (diemTB>=0 && diemTB<=10 && tuoi >= 0) {
            val sinhVienMoi = SinhVienModel(tenSV, mssv, diemTB, daTotNghiep, tuoi)
            listSV.add(sinhVienMoi)
            println("Sinh viên được thêm thành công.")
        } else {
            println("Điểm trung bình từ 0 đến 10 và tuổi phải lớn hơn hoặc bằng 0.")
        }
    } else {
        println("Thông tin sinh viên không hợp lệ.")
    }
}


fun xoaSinhVien(listSV: MutableList<SinhVienModel>) {
    println("Nhập MSSV của sinh viên cần xóa:")
    val mssv = readLine()

    val svToRemove = listSV.find { it.mssv == mssv }
    if (svToRemove != null) {
        listSV.remove(svToRemove)
        println("Đã xóa sinh viên với MSSV: $mssv")
    } else {
        println("Không tìm thấy sinh viên với MSSV: $mssv")
    }
}