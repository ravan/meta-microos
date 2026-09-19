SUMMARY = "Development files for di"
DESCRIPTION = "di (libdi) is a disk information utility library. \
 \
This package contains the files needed to develop using libdi."
LICENSE = "Zlib"

PV = "6.2.2.2"

RPM_NAME = "di-devel-6.2.2.2-1.4.aarch64.rpm"
RPM_HASH = "ddd926b638d32e9e53c01f9c372439bca01ecde234b3f902924495bc4f2e253af53f5e4290368f39579deb78fbd884701afa3fc7a39e6a2147f5e13b74810ed5"

RPROVIDES:${PN} += "di-devel \
pkgconfig-di"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdi6"

inherit rpm
