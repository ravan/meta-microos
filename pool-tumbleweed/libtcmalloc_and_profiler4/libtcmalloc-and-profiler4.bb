SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "libtcmalloc_and_profiler4-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "b40be275b20aefc4b23afcf27a17168f11726776165ff73819740e9231476985169a292c99bf8e7d7715c504f60728678a0535640f25018dd7367e80cd388484"

RPROVIDES:${PN} += "libtcmalloc-and-profiler.so.4 \
libtcmalloc-and-profiler4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
