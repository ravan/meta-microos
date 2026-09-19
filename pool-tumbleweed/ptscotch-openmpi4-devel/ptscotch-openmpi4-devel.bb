SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "7.0.15"

RPM_NAME = "ptscotch-openmpi4-devel-7.0.15-1.1.aarch64.rpm"
RPM_HASH = "aeb2ef74606a9675450d7c356c43fae769fca1c8b42d251a9904b05facaad84ae584f82f249de8d12b96010b904aadff06d1c1ad7063ea5d11216824863d1259"

RPROVIDES:${PN} += "ptscotch-openmpi4-devel \
ptscotch-parmetis-openmpi4-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch7-0-openmpi4 \
openmpi4-devel \
scotch-devel"

inherit rpm
