SUMMARY = "A Qt-based terminal emulator"
DESCRIPTION = "The lightweight Qt terminal emulator."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "qterminal-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "8be75dcecb00df89a90cf5c58ae64d2ba694ee54a54d517a79329dbb02543da36d0f35bb66695fb48f15291bd7e98d3f1c433bd8002768a3ae9e6a3766f38cb5"

RPROVIDES:${PN} += "qterminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libqtermwidget6.so.2 \
libstdc++.so.6"

inherit rpm
