SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickShapes6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "193d3e08fa83702af94ab3004244dd4a1a51a0591faa657c286064afe25458322925d06d7600958f127301ad2216f0176656d4270ae07f1bff91389efb056555"

RPROVIDES:${PN} += "libQt6QuickShapes.so.6 \
libQt6QuickShapes6 \
libQt6QuickShapesDesignHelpers.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
