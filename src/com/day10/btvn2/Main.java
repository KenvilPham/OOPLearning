package com.day10.btvn2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int SACH_GIAO_KHOA = 1;
    public static final int DO_AN = 2;
    public static final int TAI_LIEU_DIEN_TU = 3;

    public static void writeToFile(Sach sach, String fileName) throws IOException {
        File myFile = new File(fileName);
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile, true);
        fileWriter.write(sach.toString());
        fileWriter.close();
    }

    public static void loadFiles(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {
            System.out.println(myReader.nextLine());
        }
        myReader.close();
    }

    public static void main(String[] args) throws IOException {

        Sach mSach;
        List<Sach> mListSach = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so luong sach can dung: ");
        int mSoLuongSachCanDung = sc.nextInt();

        for (int i = 0; i < mSoLuongSachCanDung; i++) {
            System.out.println("Nhap loai tai lieu: " +
                    "\n1 - Sach giao khoa " +
                    "\n2 - Do an" +
                    "\n3 - Tai lieu dien tu");

            int mLoaiSach = sc.nextInt();
            switch (mLoaiSach) {
                case SACH_GIAO_KHOA:
                    mSach = new SachGiaoKhoa();
                    mListSach.add(mSach);
                    writeToFile(mSach, "sachgiaokhoa.txt");
                    break;

                case DO_AN:
                    mSach = new DoAn();
                    mListSach.add(mSach);
                    writeToFile(mSach, "doan.txt");
                    break;

                case TAI_LIEU_DIEN_TU:
                    mSach = new TaiLieuDienTu();
                    mListSach.add(mSach);
                    writeToFile(mSach, "tailieudientu.txt");
                    break;
            }
        }

        boolean exitLoadFile = true;
        while (exitLoadFile) {
            System.out.println("Nhap loai tai lieu can in: " +
                    "\n1 - Sach giao khoa " +
                    "\n2 - Do an" +
                    "\n3 - Tai lieu dien tu" +
                    "\nOther to exit");
            int documentType = sc.nextInt();
            switch (documentType) {
                case SACH_GIAO_KHOA:
                    loadFiles("sachgiaokhoa.txt");
                    break;

                case DO_AN:
                    loadFiles("doan.txt");
                    break;

                case TAI_LIEU_DIEN_TU:
                    loadFiles("tailieudientu.txt");
                    break;

                default:
                    exitLoadFile = false;
                    break;
            }
        }
    }
}
