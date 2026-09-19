SUMMARY = "Well designed C++ sqlite 3.x wrapper library"
DESCRIPTION = "VSQLite++ is a C++ wrapper for sqlite3 using the C++ standard library and boost. \
VSQLite++ is designed to be easy to use and focuses on simplicity."
LICENSE = "BSD-3-Clause"

PV = "0.3.13"

RPM_NAME = "libvsqlitepp3-0.3.13-4.21.aarch64.rpm"
RPM_HASH = "28540f0c8d9935ef7053b6f34bdcd469ad02a2ff1b5f2f14b6b1fa916a1fb1983d8a3c3bcf99963529432d2d6e4b07ad47309295454793fe9cf833ea27d8bdf3"

RPROVIDES:${PN} += "libvsqlitepp.so.3 \
libvsqlitepp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
