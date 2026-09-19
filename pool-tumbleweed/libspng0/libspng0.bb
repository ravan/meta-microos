SUMMARY = "PNG reader/writer library"
DESCRIPTION = "A C library for reading and writing Portable Network Graphics (PNG) \
format files with a focus on security."
LICENSE = "BSD-2-Clause"

PV = "0.7.4"

RPM_NAME = "libspng0-0.7.4-1.5.aarch64.rpm"
RPM_HASH = "5f9c87c16e2226934ce0a6bdb6efd8cee1204b096d236da420991fad8759e14e09e2d4292bf9f0e47a9853460a7b52797fb5d9f38573d6370cea9b3a61ec6488"

RPROVIDES:${PN} += "libspng.so.0 \
libspng0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
