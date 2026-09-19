SUMMARY = "Development files for the Edge Addition Planarity suite"
DESCRIPTION = "EAPS provides implementations of the edge addition planar \
graph embedding algorithm and related algorithms \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0.0"

RPM_NAME = "edge-addition-planarity-suite-devel-5.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "f71937b85e087bbc086535b73e23df24bf6a0f77bada4c4f15c45b56e7a3e0f23f18e2a87bcf8a1e02a82af34389c8ca012eda2b47219c606e310d40d28fd381"

RPROVIDES:${PN} += "edge-addition-planarity-suite-devel \
pkgconfig-libplanarity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplanarity4"

inherit rpm
