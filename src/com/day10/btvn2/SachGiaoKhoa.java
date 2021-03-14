package com.day10.btvn2;

public class SachGiaoKhoa extends Sach implements ISach.IMuon, ISach.IKho {
    private int mSoTrang;
    private String mTinhTrang;
    private long mTongSoLuong;
    private long mSoLuongMuon;

    public SachGiaoKhoa(String mMaSach, String mTenSach, String mNhaXuatBan, int mNamXuatBan, int mSoTrang, String mTinhTrang, long mTongSoLuong, long mSoLuongMuon) {
        super(mMaSach, mTenSach, mNhaXuatBan, mNamXuatBan);
        this.mSoTrang = mSoTrang;
        this.mTinhTrang = mTinhTrang;
        this.mTongSoLuong = mTongSoLuong;
        this.mSoLuongMuon = mSoLuongMuon;
    }

    public SachGiaoKhoa() {
        input();
    }

    public int getSoTrang() {
        return mSoTrang;
    }

    public void setSoTrang(int mSoTrang) {
        this.mSoTrang = mSoTrang;
    }

    public String getTinhTrang() {
        return mTinhTrang;
    }

    public void setTinhTrang(String mTinhTrang) {
        this.mTinhTrang = mTinhTrang;
    }

    public long getTongSoLuong() {
        return mTongSoLuong;
    }

    public void setTongSoLuong(long mTongSoLuong) {
        this.mTongSoLuong = mTongSoLuong;
    }

    public long getSoLuongMuon() {
        return mSoLuongMuon;
    }

    public void setSoLuongMuon(long mSoLuongMuon) {
        this.mSoLuongMuon = mSoLuongMuon;
    }

    @Override
    public long soLuongTonKho() {
        return mTongSoLuong - mSoLuongMuon;
    }

    @Override
    public String viTri(String vitri) {
        return vitri;
    }

    @Override
    public void input() {
        System.out.println("\nNhap vao thong tin sach giao khoa: ");
        super.input();
        System.out.println("So trang: ");
        mSoTrang = Integer.parseInt(scanner.nextLine());
        System.out.println("Tinh trang sach: ");
        mTinhTrang = scanner.nextLine();
        System.out.println("Tong so luong sach: ");
        mTongSoLuong = Long.parseLong(scanner.nextLine());
        System.out.println("So luong muon: ");
        mSoLuongMuon = Long.parseLong(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "\n***********Sach giao khoa***********"
                +super.toString()
                +"\nSo trang: " + mSoTrang
                +"\nTinh trang sach: " + mTinhTrang
                +"\nTong so luong sach: " + mTongSoLuong
                +"\nSo luong muon: " + mSoLuongMuon
                +"\nVi tri sach: " + viTri("Ke so 10")
                +"\nTon kho: " + soLuongTonKho() ;
    }
}
