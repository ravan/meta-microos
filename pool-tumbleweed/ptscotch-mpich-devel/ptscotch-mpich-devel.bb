SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-mpich-devel-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "be63171b1d02b46f7d515444a47c7d0e413f08aaeb4a2f6dad783a33b95daaa5db5c08959a613bfdf239288e0c67b0841c486fe0cd1bf1fb6943bbe2aa35ed0f"

RPROVIDES:${PN} += "ptscotch-mpich-devel \
ptscotch-parmetis-mpich-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch7-0-mpich \
mpich-devel \
scotch-devel"

inherit rpm
