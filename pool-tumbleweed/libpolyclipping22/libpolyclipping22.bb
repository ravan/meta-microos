SUMMARY = "Polygon clipping library"
DESCRIPTION = "This library primarily performs the boolean clipping operations - \
intersection, union, difference & xor - on 2D polygons. It also performs \
polygon offsetting. The library handles complex (self-intersecting) polygons, \
polygons with holes and polygons with overlapping co-linear edges. \
Input polygons for clipping can use EvenOdd, NonZero, Positive and Negative \
filling modes. The clipping code is based on the Vatti clipping algorithm, \
and outperforms other clipping libraries."
LICENSE = "BSL-1.0"

PV = "6.4.2"

RPM_NAME = "libpolyclipping22-6.4.2-2.19.aarch64.rpm"
RPM_HASH = "34f4352c41851cfc023da49a4ae0f7f042f73a606375ffa3f803d5907b408608ce9a6a1bca0154b0cde540e84b11428cbbfd07eb69d19c23a601d681d3e9a792"

RPROVIDES:${PN} += "libpolyclipping.so.22 \
libpolyclipping22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
