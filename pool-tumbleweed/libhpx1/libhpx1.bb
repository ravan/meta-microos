SUMMARY = "Libraries for the hpx package"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains libraries for the hpx package."
LICENSE = "BSL-1.0"

PV = "1.11.0"

RPM_NAME = "libhpx1-1.11.0-1.6.aarch64.rpm"
RPM_HASH = "85a62f60aa8a28445823ae0876d329d039110b987d7bd0afa2bcdd9bfa41299d0df4fa1d48ec4bd3c6175e72c3612631aa504f5bb3aaef60d6eca14956139b61"

RPROVIDES:${PN} += "libhpx-component-storage.so.1 \
libhpx-io-counters.so.1 \
libhpx-iostreams.so.1 \
libhpx-memory-counters.so.1 \
libhpx-parcel-coalescing.so.1 \
libhpx-partitioned-vector.so.1 \
libhpx-process.so.1 \
libhpx-unordered.so.1 \
libhpx.so.1 \
libhpx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhpx-core.so \
libm.so.6 \
libstdc++.so.6 \
libtcmalloc-minimal.so.4 \
openmpi5-libs"

inherit rpm
