SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.1"

RPM_NAME = "libdeal_II9_7_1-openmpi5-9.7.1-2.2.aarch64.rpm"
RPM_HASH = "5ef69a81a514b974d71559afd08d9d6c31bf5b966d958f12f3ad4d4adc57202a03d9fd37e44ece12ff85aed41ffaf7344037ada11d0385ea1782c3cf2d065d81"

RPROVIDES:${PN} += "libdeal-II.so.9.7.1 \
libdeal-II9-7-1-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmsh.so.4.15 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
libkokkoscore.so.5.1 \
libm.so.6 \
libmetis.so.5 \
libmpi.so.40 \
libmuparser.so.2.3.5 \
libopenblas.so.0 \
libscalapack.so.2.2.2 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.6 \
libz.so.1"

inherit rpm
