SUMMARY = "General-purpose scalable concurrent malloc implementation"
DESCRIPTION = "General-purpose scalable concurrent malloc(3) implementation. \
This distribution is the stand-alone 'portable' version of jemalloc."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "libjemalloc2-5.3.1-1.4.aarch64.rpm"
RPM_HASH = "1c5eaacd66d7863f555c86393bff09c4e9f86b652851cbd7bab259c5bb25a5e591f6b0ee048564262e3b5fbf06c514ae82908be136b825773f76fe87bc6f2381"

RPROVIDES:${PN} += "libjemalloc.so.2 \
libjemalloc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
