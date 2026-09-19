SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "libtcmalloc_minimal4-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "7343b3e6215b401dca809c8bbe21ed2c4900037ab6f2748c36b8a03234144157e09c439c9a4f2a5e51f27a02085884429bdb8d0855a0c6d4341b8ee2f57b71ce"

RPROVIDES:${PN} += "libtcmalloc-minimal.so.4 \
libtcmalloc-minimal4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
