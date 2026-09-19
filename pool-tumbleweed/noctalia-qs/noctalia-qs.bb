SUMMARY = "Flexible Qt/QML toolkit for Wayland shells"
DESCRIPTION = "noctalia-qs is a fork of Quickshell, a flexible toolkit for building \
desktop shells, status bars, widgets, lock screens and other desktop \
components using Qt/QtQuick and QML, on Wayland and X11. \
 \
This fork is maintained by the Noctalia project and adds shell-specific \
protocols (notably ext-background-effect-v1) and defaults. The binary \
is named 'qs' and is a drop-in replacement for the upstream quickshell \
binary."
LICENSE = "LGPL-3.0-only"

PV = "0.0.12"

RPM_NAME = "noctalia-qs-0.0.12-2.5.aarch64.rpm"
RPM_HASH = "8672a9286f46bbb063b41dc5d486b1dc22707db37a3303fe8673275d7e9212f466eb4d694731b477051b3c853434906a7dd59c1b9f6662c624fe868d56356c2e"

RPROVIDES:${PN} += "noctalia-qs \
quickshell"

RDEPENDS:${PN} += "jemalloc \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcpptrace.so.1 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjemalloc.so.2 \
libm.so.6 \
libpam.so.0 \
libpipewire-0.3.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1 \
qt6-wayland"

inherit rpm
