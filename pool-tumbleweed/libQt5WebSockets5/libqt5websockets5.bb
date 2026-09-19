SUMMARY = "Qt 5 WebSockets Library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libQt5WebSockets5-5.15.19+kde2-1.2.aarch64.rpm"
RPM_HASH = "d3a5455907c1a5596c654e577f343803ae42436325932020747758785ee475142576603a5efb7cedafc40240eab4324e2b4e7a9f0d5b1b6f05e7619daf40299c"

RPROVIDES:${PN} += "libQt5WebSockets.so.5 \
libQt5WebSockets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
