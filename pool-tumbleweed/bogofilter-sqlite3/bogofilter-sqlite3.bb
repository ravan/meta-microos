SUMMARY = "Bogofilter sqlite3 backend"
DESCRIPTION = "This package contains bogofilter build with the sqlite3 backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "bogofilter-sqlite3-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "a06e37cc2eb1817eb0a3df345a3d2979104f539a0323563f439729cc6db9317ea1e795a299777bc75d13cce6d24766481e9556355a3617411779f434b0fc0e36"

RPROVIDES:${PN} += "bogofilter-backend \
bogofilter-sqlite3"

RDEPENDS:${PN} += "/usr/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libsqlite3.so.0 \
update-alternatives"

inherit rpm
