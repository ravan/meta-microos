SUMMARY = "Boost.MPI runtime library"
DESCRIPTION = "This package contains the Boost.MPI runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_mpi1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "80535204178f1a4f9c4d04feb050b621e86ce72fc54742a70a1c845db75749d2d4002ddd9eac192c4ebbb1bb5277bec307b5f8b8529fe316f57c91edc6b18735"

RPROVIDES:${PN} += "libboost-mpi.so.1.91.0 \
libboost-mpi1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
