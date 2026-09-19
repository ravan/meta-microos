SUMMARY = "Development headers for Boost.Wave library"
DESCRIPTION = "This package contains development headers for Boost.Wave library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_wave1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "942c50f3e20b9ce33adf486c242772cfab426b6e73034c4ed18e10e80743be7f993c38c28023da4638fbd18cc1c45addc9247a82ea597be32b9707dc1c6a7ad1"

RPROVIDES:${PN} += "libboost-wave-devel-impl \
libboost-wave1-91-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-91-0-devel \
libboost-date-time1-91-0-devel \
libboost-filesystem1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-serialization1-91-0-devel \
libboost-thread1-91-0-devel \
libboost-wave1-91-0"

inherit rpm
