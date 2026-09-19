SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.1"

RPM_NAME = "libdeal_II9_7_1-9.7.1-2.2.aarch64.rpm"
RPM_HASH = "8b0d17f2bb9e640c88a0c6d86769988f38569485833b35fafaef1cd0fd949a2f4dfe0d5b1a5ee4313e83a016c16849668f443fe39b39923315b84dd9bb5cdde0"

RPROVIDES:${PN} += "libdeal-II.so.9.7.1 \
libdeal-II9-7-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmsh.so.4.15 \
libgomp.so.1 \
libgsl.so.28 \
libkokkoscore.so.5.1 \
libm.so.6 \
libmetis.so.5 \
libmuparser.so.2.3.5 \
libopenblas.so.0 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.6 \
libz.so.1"

inherit rpm
