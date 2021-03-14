package com.day10.btvn2;

public class TaiLieuDienTu extends Sach implements ISach.IDownload {
    private float mDungLuong;
    private long mLuotTai;
    private long mGiaThanh;

    public TaiLieuDienTu(String mMaSach, String mTenSach, String mNhaXuatBan, int mNamXuatBan, float mDungLuong, long mLuotTai, long mGiaThanh) {
        super(mMaSach, mTenSach, mNhaXuatBan, mNamXuatBan);
        this.mDungLuong = mDungLuong;
        this.mLuotTai = mLuotTai;
        this.mGiaThanh = mGiaThanh;
    }

    public TaiLieuDienTu() {
        input();
    }

    public float getDungLuong() {
        return mDungLuong;
    }

    public void setDungLuong(float mDungLuong) {
        this.mDungLuong = mDungLuong;
    }

    public long getLuotTai() {
        return mLuotTai;
    }

    public void setLuotTai(long mLuotTai) {
        this.mLuotTai = mLuotTai;
    }

    public long getGiaThanh() {
        return mGiaThanh;
    }

    public void setGiaThanh(long mGiaThanh) {
        this.mGiaThanh = mGiaThanh;
    }

    @Override
    public long tongTien() {
        return mLuotTai * mGiaThanh;
    }

    @Override
    public void input() {
        System.out.println("Nhap vao thong tin tai lieu dien tu: ");
        super.input();
        System.out.println("Dung luong sach: ");
        mDungLuong = Float.parseFloat(scanner.nextLine());
        System.out.println("Luot tai sach: ");
        mLuotTai = Long.parseLong(scanner.nextLine());
        System.out.println("Gia thanh sach: ");
        mGiaThanh = Long.parseLong(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "\n***********Tai lieu dien tu***********"
                +super.toString()
                +"\nDung luong sach: " + mDungLuong
                +"\nLuot tai sach: " + mLuotTai
                +"\nGia thanh sach: " + mGiaThanh
                +"\nTong tien: " + tongTien();
    }
}
