SUMMARY = "MPEG-4 Simple and Advanced Simple Profile codec"
DESCRIPTION = "Xvid is a high quality MPEG-4 ASP video codec. \
Shared library of XviD video codec."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "libxvidcore4-1.3.7-4.6.aarch64.rpm"
RPM_HASH = "58f7635d08a09faf416cc4e8050dd2c3844e3c7734dea2245d65c89e739e629dd565adf0e734a7dd888900d9ec5f8b3ddbe4c9ea6951297fadb8b24f33cdb204"

RPROVIDES:${PN} += "libxvidcore.so.4 \
libxvidcore4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
