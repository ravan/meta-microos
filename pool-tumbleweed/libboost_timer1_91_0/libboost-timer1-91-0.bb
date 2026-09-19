SUMMARY = "Boost.Timer runtime library"
DESCRIPTION = "This package contains Boost.Timer runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_timer1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "1bceb39cbdf42ffaf081dcf234b51d08748fb124bb6a0a440e31e7aa7b48cc08706c5895d3c66ca6147e7220a3f4502ddc5c9fce87ac4f043369ca412f8b11a6"

RPROVIDES:${PN} += "libboost-timer.so.1.91.0 \
libboost-timer1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
