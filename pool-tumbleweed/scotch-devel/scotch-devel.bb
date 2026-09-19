SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "scotch-devel-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "02e247fa515a7f3f0a470c4e11adff5b3a96821b89427a905dc32e112d33c0265684fbaf2cb7e8c9d9173379ef51101ceeea4481f5e0b040e40ef4464448319e"

RPROVIDES:${PN} += "cmake-SCOTCH \
scotch-devel"

RDEPENDS:${PN} += "gcc-fortran \
libscotch7-0"

inherit rpm
