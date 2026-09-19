SUMMARY = "Qt6 Bindings for avahi, the D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Qt6 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt6-1-0.8-45.2.aarch64.rpm"
RPM_HASH = "e588a14d1c54ff6e1b2a374f6f1a662a1d25e20e8d49e7117295b23d59bd7d3a91ee17bd7b341e5c5930da3c18c24bc2d024b83d875e0f75f37bbfbe4d1b193d"

RPROVIDES:${PN} += "libavahi-qt6-1 \
libavahi-qt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
