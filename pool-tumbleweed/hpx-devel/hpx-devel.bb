SUMMARY = "Development headers and libraries for hpx"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains development headers and libraries for hpx"
LICENSE = "BSL-1.0"

PV = "1.11.0"

RPM_NAME = "hpx-devel-1.11.0-1.6.aarch64.rpm"
RPM_HASH = "3c05a86fa058f91bb0f7054a5bbab54943bb161f0327d5393128cd5c3d6a815da4daf949f1694d3291a0bd6da6569d8a72446b221677067b9ea73b68bff20cdc"

RPROVIDES:${PN} += "cmake-HPX \
hpx-devel \
libhpx-core.so \
pkgconfig-hpx-application-relwithdebinfo \
pkgconfig-hpx-component-relwithdebinfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libhpx1 \
libhwloc.so.15 \
libm.so.6 \
libstdc++.so.6 \
libtcmalloc-minimal.so.4 \
openmpi5-devel"

inherit rpm
