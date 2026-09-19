SUMMARY = "Development files for libical, an implementation of basic iCAL protocols"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
Calendaring and Scheduling protocols. (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "libical-devel-3.0.20-1.6.aarch64.rpm"
RPM_HASH = "a1d1e803e0e0721718c824187b5bbbb844b2e09e581c2b665eb0d3d2f236bb4d36ae1704ecc4db8f80b4aed0fbe044c64e550c7e693a90a46e978d992dd67951"

RPROVIDES:${PN} += "cmake-LibIcal \
libical-devel \
pkgconfig-libical"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libical3 \
pkgconfig-icu-i18n"

inherit rpm
