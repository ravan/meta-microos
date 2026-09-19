SUMMARY = "Qt5 Bindings for avahi, the D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Qt5 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt5-1-0.8-45.2.aarch64.rpm"
RPM_HASH = "72e501ecdab44321484134fef5379f3c48dba11ce9cae2dd3d24a3dd88a4a0904e7927a568ee16c5a938cc8adf0d181944879abb816b6e5d0bed16bfd8e1c19c"

RPROVIDES:${PN} += "libavahi-qt5-1 \
libavahi-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
