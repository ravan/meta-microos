SUMMARY = "Development files for rtl-sdr"
DESCRIPTION = "Library headers for rtl-sdr driver."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "rtl-sdr-devel-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "74645d0a45461fa8cd9638ffc88a1874812118e2c85435c1d99ebac79f427971629b38b389ccdc3177535a91cfb23364d99869ff9275a486bdcc6b516272ac57"

RPROVIDES:${PN} += "cmake-rtlsdr \
pkgconfig-librtlsdr \
rtl-sdr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtlsdr0"

inherit rpm
