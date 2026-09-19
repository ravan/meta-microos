SUMMARY = "C++/Qt Client Library for gpodder.net"
DESCRIPTION = "libmygpo-qt is a Qt Library that wraps the gpodder.net Web API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git.20250222T125957~4dfa3ba"

RPM_NAME = "libmygpo-qt6-1-1.2.0git.20250222T125957~4dfa3ba-1.6.aarch64.rpm"
RPM_HASH = "2c568e3e60e651207de1957100f1540f24084cdeb0bf56f7c6f22719bf0798b9759d5a857e2420bbef86a2d5739e73eccf71ecb5d3c216331beba55340be83ae"

RPROVIDES:${PN} += "libmygpo-qt6-1 \
libmygpo-qt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
