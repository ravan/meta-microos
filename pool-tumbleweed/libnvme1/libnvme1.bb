SUMMARY = "Linux-native nvme device management library"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.2"

RPM_NAME = "libnvme1-1.16.2-1.3.aarch64.rpm"
RPM_HASH = "15f6b5f97b521398a4a3d1f170c21a6e690a8d9de78081a1f8808a174842937876d3dbdb8bf5d708a1e0a5e0916c5b34cd7451232cf3721f8b7671f5838c5f24"

RPROVIDES:${PN} += "libnvme.so.1 \
libnvme1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libkeyutils.so.1"

inherit rpm
