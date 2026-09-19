SUMMARY = "Non-ABI stable API for the Qt 6 WebChannel library"
DESCRIPTION = "This package provides private headers of libQt6WebChannel that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webchannel-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b3eb1f9bd13f05bc350b71988ea29943541ea33667e318118a4fe58f4ba8f648abdb79a24482d1f1583687590ab8cb95ed9dc125dbc8c36394cc6223b0749767"

RPROVIDES:${PN} += "cmake-Qt6WebChannelPrivate \
qt6-webchannel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebChannel"

inherit rpm
