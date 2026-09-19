SUMMARY = "Fast Library for Approximate Nearest Neighbors"
DESCRIPTION = "FLANN is a library for performing approximate nearest neighbor \
searches in high dimensional spaces. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libflann1_9-1.9.2-3.14.aarch64.rpm"
RPM_HASH = "fa6647381fbc6a9119e3d6148564889c4fc99b475ef907911e2ce8769af6d7b35ae0547fe3713eebf4b8956b092bb81f603213333d3c79ad7627ee7b71c49427"

RPROVIDES:${PN} += "libflann-cpp.so.1.9 \
libflann-cpp1-9 \
libflann.so.1.9 \
libflann1-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
liblz4.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
