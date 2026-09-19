SUMMARY = "Development headers for Boost.Timer library"
DESCRIPTION = "This package contains development headers for Boost.Timer library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_timer1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ba4af90e974788b33a32cbdc19b033c9f3f861f86c26080101ce681c723b6e98dcf3d37f382c03daf3755183e8975be9bfb6977c18373b7110045dff13bb8bc0"

RPROVIDES:${PN} += "libboost-timer-devel-impl \
libboost-timer1-91-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-timer1-91-0"

inherit rpm
