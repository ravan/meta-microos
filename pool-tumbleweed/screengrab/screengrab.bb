SUMMARY = "Qt tool for creating screenshots"
DESCRIPTION = "Screenshot taker with the ability to publish them via hosting services."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.2.0"

RPM_NAME = "screengrab-3.2.0-2.1.aarch64.rpm"
RPM_HASH = "fe8a3b4988875630c06e17e2205539a041ec9982fc38ae5ae25c6c344e0fee5bb1d0580ae5b057150addf7792a813221efde4d1f433c9da64e17dcad73ece40e"

RPROVIDES:${PN} += "screengrab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libX11-xcb.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-xfixes.so.0"

inherit rpm
