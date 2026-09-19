SUMMARY = "A Read-Only File System with Efficient Compression"
DESCRIPTION = "This package contains the userland utilities to create and read \
squashfs images."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "squashfs-4.6.1-2.11.aarch64.rpm"
RPM_HASH = "a2a858d20f344d2b4b9240b9e6954281175b5869c2531ead24fca42efef0bfacd692349cc56bd3c285b0192326218055fac17ea7632025bad982581db58b15b8"

RPROVIDES:${PN} += "squashfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
