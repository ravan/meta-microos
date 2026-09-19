SUMMARY = "Shared library for blaspp"
DESCRIPTION = "This package provides the shared library for blaspp."
LICENSE = "BSD-3-Clause"

PV = "2025.05.28"

RPM_NAME = "libblaspp2-2025.05.28-1.5.aarch64.rpm"
RPM_HASH = "c5f300c9a5e8d2d0ee91c01b14c7b2537242c817c2f2b921819c97cc8909c2b91e5be454dd54a8dcd76ed9c3f129d58cf155b684da83f8397e24706cf7d4135b"

RPROVIDES:${PN} += "libblaspp.so.2 \
libblaspp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libstdc++.so.6"

inherit rpm
