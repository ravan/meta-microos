SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "libtcmalloc_debug4-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "79c421c1143bba58f8e7d63ff7b6716b488fba3962ece89e61ada245cf5fe013e654d88f64f6fb8cb0426e26f5d05481707bd8973726ea3facd74341d33fadfe"

RPROVIDES:${PN} += "libtcmalloc-debug.so.4 \
libtcmalloc-debug4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
