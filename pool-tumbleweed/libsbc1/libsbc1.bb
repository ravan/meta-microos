SUMMARY = "Bluetooth Low-Complexity, Sub-Band Codec Library"
DESCRIPTION = "The package contains libraries for using the SBC codec."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2"

RPM_NAME = "libsbc1-2.2-1.3.aarch64.rpm"
RPM_HASH = "cfeddebdff0cfb193c7f4e203dbc5b532110e20f33ae9b1ebfacb75b6d901254c5462889d46836b9b6ec70cb6c3d0bd2a08cec377ed74e5c572dd493cfe7b35c"

RPROVIDES:${PN} += "libsbc.so.1 \
libsbc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
