package com.example.lab2_ph42640_kot104

class SinhVienModel(var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep : Boolean? = null
    var tuoi :Int? = null

    constructor( tenSV: String,  mssv: String,  diemTB: Float, datotnghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }

    fun getThongTin(): String {
        var sDaTotNghiep : String
        if (daTotNghiep == null){
            sDaTotNghiep= "Chua co du lieu"
        }else{
            if (daTotNghiep!!){
                sDaTotNghiep="Da tot nghiep"
            }else{
                sDaTotNghiep ="Chua tot nghiep"
            }
        }
        var sTuoi: String
        if (tuoi== null){
            sTuoi="Chua co du lieu"
        }
        else{
            sTuoi = tuoi.toString()
        }
        return "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB , da tot nghiep: $sDaTotNghiep , tuoi: $sTuoi"
    }
}