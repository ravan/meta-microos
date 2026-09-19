SUMMARY = "Qt Frontend for Marble"
DESCRIPTION = "The Qt frontend for the Marble map viewer"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "marble-qt-26.08.1-1.2.aarch64.rpm"
RPM_HASH = "42f7d1db38d8675706576a6fd7f400934312ad6366ae9ff154203d09baa904147e2f5aefeab90002308ede9cd50bf2b7fae6fd0df8efe1c23b755ee0f0e7bd7c"

RPROVIDES:${PN} += "marble-frontend \
marble-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libmarblewidget-qt6.so.28 \
libstdc++.so.6 \
marble"

inherit rpm
