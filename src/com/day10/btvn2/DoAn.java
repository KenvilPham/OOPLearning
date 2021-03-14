package com.day10.btvn2;

public class DoAn extends Sach implements ISach.IKho {
    private int mSoTrang;
    private String mTinhTrang;
    private int mNamBaoVe;

    public DoAn(String mMaSach, String mTenSach, String mNhaXuatBan, int mNamXuatBan, int mSoTrang, String mTinhTrang, int mNamBaoVe) {
        super(mMaSach, mTenSach, mNhaXuatBan, mNamXuatBan);
        this.mSoTrang = mSoTrang;
        this.mTinhTrang = mTinhTrang;
        this.mNamBaoVe = mNamBaoVe;
    }

    public DoAn() {
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

    public int getNamBaoVe() {
        return mNamBaoVe;
    }

    public void setNamBaoVe(int mNamBaoVe) {
        this.mNamBaoVe = mNamBaoVe;
    }

    @Override
    public String viTri(String vitri) {
        return vitri;
    }

    @Override
    public void input() {
        System.out.println("Nhap vao thong tin do an: ");
        super.input();
        System.out.println("So trang: ");
        mSoTrang = Integer.parseInt(scanner.nextLine());
        System.out.println("Tinh trang sach: ");
        mTinhTrang = scanner.nextLine();
        System.out.println("Nam bao ve: ");
        mNamBaoVe = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "\n***********Do an***********"
                +super.toString()
                +"\nSo trang: " + mSoTrang
                +"\nTinh trang sach: " + mTinhTrang
                +"\nVi tri: " + viTri("Ke so 22")
                +"\nNam bao ve: " + mNamBaoVe;
    }
}
