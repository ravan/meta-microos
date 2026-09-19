SUMMARY = "Development files for libminiz"
DESCRIPTION = "Development files for miniz, a zlib-replacement library"
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "miniz-devel-3.1.2-1.3.aarch64.rpm"
RPM_HASH = "d1bcad15958954225500e308fb7e70334c4d0f2690490662764e259fe480f747b89bd867ecc99d512a85655a4cc774c3dde6c87b1d68fadca9235e5a38187d02"

RPROVIDES:${PN} += "cmake-miniz \
miniz-devel \
pkgconfig-miniz"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminiz3"

inherit rpm
