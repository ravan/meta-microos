SUMMARY = "Non-ABI stable API for the Qt 6 WebChannelQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebChannelQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webchannelquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1c856bc9abdab087b055808a860d37ca29286dc95b8476840767b2d643ba556a21589af3409ecbcf42a9f09b2b5af1e8074d7f1473de1793bbc187f6647d0d6f"

RPROVIDES:${PN} += "cmake-Qt6WebChannelQuickPrivate \
qt6-webchannelquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebChannelQuick"

inherit rpm
