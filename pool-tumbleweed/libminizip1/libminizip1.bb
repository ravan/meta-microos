SUMMARY = "Library for manipulation with .zip archives"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.3.1"

RPM_NAME = "libminizip1-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "92eb1ee0498470329ca3ff389027639d73c1c323f2b5d09fbf88e50888bd12e0ebfb1c79aabb0217dc01f8692e0c83a7590e616eb7c30ba4095a6732943001bc"

RPROVIDES:${PN} += "libminizip.so.1 \
libminizip1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
