SUMMARY = "Header files for Avahi's Qt5 bindings"
DESCRIPTION = "Development files for the Qt5 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt5-devel-0.8-45.2.aarch64.rpm"
RPM_HASH = "c9361d2ac0fede8c202787ddd6f4c20cb2d3542408593e2144e7505c5cc3cba5caae1cc9336fa9ae52bac75d8c8d6d7478b7812f1cbd358d0a5e2070257d2e1b"

RPROVIDES:${PN} += "libavahi-qt5-devel \
pkgconfig-avahi-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libavahi-qt5-1 \
pkgconfig-Qt5Core"

inherit rpm
