SUMMARY = "Easy to use 2D geometry library in C++"
DESCRIPTION = "A C++ 2D geometry library geared towards processing data \
associated with vector graphics. The primary design consideration \
is ease of use and clarity."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.4.0"

RPM_NAME = "lib2geom1_4_0-1.4.0-3.5.aarch64.rpm"
RPM_HASH = "2289ff1ae8fad09526bc7980e0a226c3ee03b98bcb342464090d82954541723e55c9e9fed87d91cb37da0ec03da02d3b72c16eeae784e7320753f15173ed7e38"

RPROVIDES:${PN} += "lib2geom.so.1.4.0 \
lib2geom1-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
