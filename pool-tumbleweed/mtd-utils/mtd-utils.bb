SUMMARY = "Tools for maintaining Memory Technology Devices"
DESCRIPTION = "This package contains tools for erasing and formatting flash devices, \
including JFFS2, M-Systems DiskOnChip devices, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "mtd-utils-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "6ea4008c072c6035b72877fe07262391770b7dd07148deac3ded7f9e5d7155c9af9d06c1615de5ab3ab752e106f702d827da8082a30abe89a2294b6f974137ae"

RPROVIDES:${PN} += "mtd-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzo2.so.2 \
libselinux.so.1 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
