use hibernateDemo
create table lophoc
(
    ma_lop INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    ten_lop VARCHAR(50)
)

create table sinhvien(
    ma_sinh_vien INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    ten_sinh_vien VARCHAR(50),
    dia_chi VARCHAR(50),
    ma_lop INT,
    FOREIGN KEY (ma_lop) REFERENCES lophoc(ma_lop)
)

create table monhoc(
    ma_mon INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    ten_mon VARCHAR(50),
)

create table diem(
    id INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    ma_sinh_vien INT,
    ma_mon INT,
    diem FLOAT,
    FOREIGN KEY (ma_sinh_vien) REFERENCES sinhvien(ma_sinh_vien),
    FOREIGN KEY (ma_mon) REFERENCES monhoc(ma_mon)
)
SELECT * FROM lophoc
SELECT * FROM sinhvien
