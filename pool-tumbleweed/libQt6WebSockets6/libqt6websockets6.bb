SUMMARY = "Qt 6 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebSockets6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "811f48b2cb793d227cc872d9041baeb51476b278ede803eeb407570d4692db68ebaa8ce0718fa792691e067062e917ddc0cfd5908c597ebc72a1170043711f0f"

RPROVIDES:${PN} += "libQt6WebSockets.so.6 \
libQt6WebSockets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
