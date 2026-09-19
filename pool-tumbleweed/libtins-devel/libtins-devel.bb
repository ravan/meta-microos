SUMMARY = "Development files for tins"
DESCRIPTION = "This package contains header files, and libraries needed to develop \
application that use libtins."
LICENSE = "BSD-2-Clause"

PV = "4.6"

RPM_NAME = "libtins-devel-4.6-1.1.aarch64.rpm"
RPM_HASH = "7e21ed2153b026e53fcd3376e3cdd57cbe0eb6020b7572ffe57ff540aa8ec16f03fd3412644dea88ddf380847f4730f81e64b62dc8f87c438b860f40b21e3a4c"

RPROVIDES:${PN} += "cmake-libtins \
libtins-devel \
pkgconfig-libtins"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcap-devel \
libtins4-6"

inherit rpm
