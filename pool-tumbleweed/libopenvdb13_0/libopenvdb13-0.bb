SUMMARY = "Sparse volume data structure library"
DESCRIPTION = "OpenVDB is a C++ library comprising a hierarchical data structure and \
a large suite of tools for the efficient storage and manipulation of \
sparse volumetric data discretized on three-dimensional grids."
LICENSE = "Apache-2.0"

PV = "13.0.0"

RPM_NAME = "libopenvdb13_0-13.0.0-2.1.aarch64.rpm"
RPM_HASH = "cbb12cc269c16a0e950ccd177a03b690901369aebc0b38e276daefbfc84547b8286023b24d4087e30a2ef01d600354e57010a07aeaf01b58ba8f4745e3e4ed97"

RPROVIDES:${PN} += "libopenvdb.so.13.0 \
libopenvdb13-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libblosc.so.1 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
