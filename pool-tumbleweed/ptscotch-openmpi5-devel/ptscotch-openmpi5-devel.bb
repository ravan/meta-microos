SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-openmpi5-devel-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "25281a1531157aa2598786522e8c506f64fdaa75664bf0afbeb0d4b4b4dcca6e5f1da95885189e19829b88a922f4366c9b222a1d4d8f69b9364941d86aa72d14"

RPROVIDES:${PN} += "ptscotch-openmpi5-devel \
ptscotch-parmetis-openmpi5-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch7-0-openmpi5 \
openmpi5-devel \
scotch-devel"

inherit rpm
