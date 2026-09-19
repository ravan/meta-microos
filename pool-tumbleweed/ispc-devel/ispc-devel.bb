SUMMARY = "Development files for ispc"
DESCRIPTION = "This package contains the C++ header, symbolic links to the shared \
libraries and cmake files for ispc.  If you would like to develop \
programs using ispc, you will need to install ispc-devel."
LICENSE = "BSD-3-Clause"

PV = "1.31.0"

RPM_NAME = "ispc-devel-1.31.0-2.3.aarch64.rpm"
RPM_HASH = "e5592beb75e054f01ab0aaa3fa5acfb38be1f975cfa837b3fc38464dd83bb96cbcebb23f0a5a21479e1209132589060cfc4098f9be2dd31d0767f20de38c8571"

RPROVIDES:${PN} += "cmake-ispc \
cmake-ispcrt \
ispc-devel"

RDEPENDS:${PN} += "ispc \
libispcrt1"

inherit rpm
