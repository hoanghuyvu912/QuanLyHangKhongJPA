package com.nonit.QuanLyHangKhongJPA.service.dto;

import com.nonit.QuanLyHangKhongJPA.entity.MayBay;
import com.nonit.QuanLyHangKhongJPA.entity.NhanVien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChungNhanRestDTO {
    private NhanVien nhanVien;
    private MayBay mayBay;
}
