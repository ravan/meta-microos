SUMMARY = "Library for querying public transport data onboard trains"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
transport journey queries. This package contains a library to determine \
the presence onboard of a train using WiFi SSIDs and provide journey \
details."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKPublicTransportOnboard1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "11767e26b60ca80edc1082616cb5a2829a534c99c58a2df8f314f3a0a1462027ca207c8a72c1b8b088759a31102ac8c3ab9c7417fd01b4f750939c22623a9baa"

RPROVIDES:${PN} += "libKPublicTransportOnboard.so.1 \
libKPublicTransportOnboard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6NetworkManagerQt.so.6 \
libKPublicTransport.so.1 \
libKPublicTransport1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
