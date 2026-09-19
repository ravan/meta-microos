SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-packetprotocol-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "c02c326ffce0b1cd80a9729dcdfbaf1ca9d11fe630d5e9b555c18f675d9e2a11234da5e7431136846fe902a5a83e3bb1876f18b28db0878fbb2abae2a5ec3e28"

RPROVIDES:${PN} += "cmake-Qt6PacketProtocolPrivate \
qt6-packetprotocol-devel-static \
qt6-packetprotocol-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate"

inherit rpm
