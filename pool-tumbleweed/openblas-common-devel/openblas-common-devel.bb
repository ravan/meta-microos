SUMMARY = "Development headers and libraries for OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains headers for OpenBLAS."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "openblas-common-devel-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "659af05a81ad3c48a86311793e2b482c9000e200d51eb0613f6968ac9854970452d6c16bc3b12de5355b909934d6c000b62aea8e10c28ad9e69d378435ef0cb3"

RPROVIDES:${PN} += "openblas-common-devel \
openblas-devel-headers \
pkgconfig-openblas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
libopenblas-serial-devel"

inherit rpm
