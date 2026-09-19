SUMMARY = "Headers and library links for libHYPRE301"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the serial version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-devel-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "a9a16ae6339787ea87a2e1993cf6257f8173121e644cdf536a990db0d9d350a6f54cf5d6041a655de6a8e00b3b584065b988fca41ce46e2c009c2f31ff460bc7"

RPROVIDES:${PN} += "cmake-HYPRE \
hypre-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE301 \
superlu-devel"

inherit rpm
