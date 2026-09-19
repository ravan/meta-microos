SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "libtcmalloc4-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "b1028dda53f9cb926bf5d31d3c53490d8fc5dccd68dcb9cadd4044982f8818af4450c9f2fa9f8e1fbbaedf6103d2e81386e21c4fbba95af032767ddc05534ab7"

RPROVIDES:${PN} += "libtcmalloc.so.4 \
libtcmalloc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
