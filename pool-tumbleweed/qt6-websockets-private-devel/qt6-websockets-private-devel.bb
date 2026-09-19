SUMMARY = "Non-ABI stable API for the Qt 6 WebSockets library"
DESCRIPTION = "This package provides private headers of libQt6WebSockets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-websockets-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0dc0403eeeb2283c6f07f0906a187bac46324910ee50674c6e1dad297683da8d7878f08194ec2c41b63fcf25f89f8586ecb95915f28afec704453808d4255436"

RPROVIDES:${PN} += "cmake-Qt6WebSocketsPrivate \
qt6-websockets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6WebSockets"

inherit rpm
