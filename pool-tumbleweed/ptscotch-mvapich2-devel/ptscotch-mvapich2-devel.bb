SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-mvapich2-devel-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "80ec874f97b77e820a56cb02fa6ca9706daa4f99b6a89af6d2b8d4f76c132096032ce56c3b457479a1cd4f1cc2822ffe915decd6b6097055e598441d28a2d84e"

RPROVIDES:${PN} += "ptscotch-mvapich2-devel \
ptscotch-parmetis-mvapich2-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch7-0-mvapich2 \
mvapich2-devel \
scotch-devel"

inherit rpm
