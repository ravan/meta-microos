SUMMARY = "Basic data structures in C (libstdc++ wrapper)"
DESCRIPTION = "Library that offers basic data structures (list, set, map, ..) \
in a C API for user-space applications. \
 \
Key features: \
 - No 'magic' MACROs, and no need to modify your data structures \
   (except, perhaps, for __attribute__((packed))) \
 - Uses C++ standard library as the backend for most data structures"
LICENSE = "BSD-2-Clause"

PV = "0.6.4"

RPM_NAME = "libcdada0-0.6.4-1.3.aarch64.rpm"
RPM_HASH = "8313da6a3b9ba93ba3be2163c2272a14850604021d3e88bb329a320c8789f36418e17c9a9c6717472bb42f82439d67ef13dd4fb5962fbcfef1e709ceeed2bf82"

RPROVIDES:${PN} += "libcdada.so.0 \
libcdada0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
