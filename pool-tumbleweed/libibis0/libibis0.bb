SUMMARY = "Library files for ibis"
DESCRIPTION = "Library files for ibis."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.0"

RPM_NAME = "libibis0-0.16.0-1.3.aarch64.rpm"
RPM_HASH = "1a9dceab92554b155effaf8be1c9e32d4e13c271f2517c6c58dc1fb3c1008f119138d80a86cf0f4be96a92d78504c5e966fb6e68c3a10bd257d200e403329f46"

RPROVIDES:${PN} += "libibis.so.0 \
libibis0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbirb.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhasl.so.0 \
libpango-1.0.so.0"

inherit rpm
