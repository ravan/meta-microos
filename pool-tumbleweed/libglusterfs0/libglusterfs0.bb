SUMMARY = "GlusterFS's core library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "libglusterfs0-11.1-4.10.aarch64.rpm"
RPM_HASH = "d1cc0c48e9295068ac221744273ef7beef0f0d1f37a24ed89e64ae9b38573114079ad6b220f996ca2f112c8746169fb9a6b000e3d80a781c63e9588fc325d2fc"

RPROVIDES:${PN} += "libglusterfs.so.0 \
libglusterfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
