SUMMARY = "Qt5 interface module for ZLibrary"
DESCRIPTION = "This package provides a Qt5-based UI for ZLibrary."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "libzlui0_99-0.99.4-5.4.aarch64.rpm"
RPM_HASH = "31f58461682fb345c3272394a0a4bd1fdbebe31698b4681a1eae97f897cd890fa2e87b2eb16318f809409e14f9442a463a60a967a9466e69e45f7f4f88d732fe"

RPROVIDES:${PN} += "libzlui.so.0.99 \
libzlui0-99 \
zlibrary-ui"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libzlcore.so.0.99 \
zlibrary-data"

inherit rpm
