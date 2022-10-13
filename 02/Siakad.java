public class Siakad {
}

class Prodi {
	String kode;
	String nama;
	String jenjang;
}

class Mahasiswa {
	String NIM;
	String nama;
	Prodi prodi;
	Dosen dosenWali;
}

class Dosen {
	String NIDN;
	String nama;
	Prodi prodi;
}

class Semester {
	int tahun;
	String semester;
}

class RencanaStudi {
	Mahasiswa mahasiswa;
	Semester semester;
	RencanaStudiDetail[] detail;
	double targetIP;
	boolean disetujui;
	Dosen disetujuiOleh;
}

class RencanaStudiDetail {
	KelasMataKuliah kelas;
	String targetNilai;
}

class KelasMataKuliah {
	MataKuliah mataKuliah;
	String namaKelas;
	Semester semester;
}

class MataKuliah {
	String kode;
	String nama;
	int sks;
}


