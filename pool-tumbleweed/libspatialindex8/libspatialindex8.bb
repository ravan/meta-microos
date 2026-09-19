SUMMARY = "A library for spatial indexing"
DESCRIPTION = "libspatialindex provides a general framework for developing spatial indices. \
Currently it defines generic interfaces, provides simple main memory and disk \
based storage managers and a robust implementation of an R*-tree, an MVR-tree \
and a TPR-tree."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "libspatialindex8-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "a795a3286fe37dd893d8c4dc7259a38d9bd940ab08b9b7c86e94467348b9c9be1f528e9d11ff755e3c37e1f3aa9dd40978bc217208b0d49e5168cac7c49c00bc"

RPROVIDES:${PN} += "libspatialindex-c.so.8 \
libspatialindex.so.8 \
libspatialindex8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
