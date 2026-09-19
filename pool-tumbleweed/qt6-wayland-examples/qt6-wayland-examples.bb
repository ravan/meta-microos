SUMMARY = "Examples for the qt6-wayland modules"
DESCRIPTION = "Examples for the qt6-wayland modules."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "32a87e22e36bc1478e57b4ca3115a7c91f3a3dcf4192b3bdcf28d68cc7dffd86d496924087ae49956de9e976e435963f61aa24b0c101812fc62dd777b9a6edc3"

RPROVIDES:${PN} += "libexampleshellplugin.so \
qt6-wayland-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6WaylandClient.so.6 \
libQt6WaylandCompositor.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.VirtualKeyboard \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtWayland.Compositor \
qt6qmlimport-QtWayland.Compositor.IviApplication \
qt6qmlimport-QtWayland.Compositor.QtShell \
qt6qmlimport-QtWayland.Compositor.WlShell \
qt6qmlimport-QtWayland.Compositor.XdgShell"

inherit rpm
