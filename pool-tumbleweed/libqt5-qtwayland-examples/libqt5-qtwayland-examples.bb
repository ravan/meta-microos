SUMMARY = "Qt5 wayland examples"
DESCRIPTION = "Examples for libqt5-qtwayland module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde55"

RPM_NAME = "libqt5-qtwayland-examples-5.15.19+kde55-1.2.aarch64.rpm"
RPM_HASH = "530f83750817d63ef4c28a670075895dcc6808d456ca7f442e9f8ece0a7b61ff49958e3e9a3fc466b8e1f3ee182ee60410a18cfd022168a73e51b86e8deb149e"

RPROVIDES:${PN} += "libqt5-qtwayland-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WaylandClient.so.5 \
libQt5WaylandCompositor.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWayland.Client.TextureSharing.1 \
qt5qmlimport-QtWayland.Compositor.1"

inherit rpm
