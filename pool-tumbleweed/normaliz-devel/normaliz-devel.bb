SUMMARY = "Development files for Normaliz, a tool for computation of rotational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. \
 \
Normaliz offers an API, libnormaliz, that allows the user to access \
the Normaliz computations from C++ programs."
LICENSE = "GPL-3.0-or-later"

PV = "3.11.1"

RPM_NAME = "normaliz-devel-3.11.1-1.5.aarch64.rpm"
RPM_HASH = "0973a1377d20f0cfa85332ccb51aac5b4c4741e01f540565a8db2204d2ae27348bb1d3982d6546299e289c9092129f84fcb1a726cf2671509be0f8b9e98aa8c9"

RPROVIDES:${PN} += "normaliz-devel"

RDEPENDS:${PN} += "e-antic-devel \
gmp-devel \
libnormaliz3"

inherit rpm
