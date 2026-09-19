SUMMARY = "Development files for libublksrv"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
make use of the ublk framework."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "ublksrv-devel-1.6-2.3.aarch64.rpm"
RPM_HASH = "d91f1e445609b127318dbc9ee60efcfa380eee81e6dc5e405f31047b4113dec2f77744cab335214011b5e2d1bb8667ea0b8a02c0dc50f34f08648d7ab5999fdc"

RPROVIDES:${PN} += "pkgconfig-ublksrv \
ublksrv-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libublksrv0 \
pkgconfig-liburing"

inherit rpm
