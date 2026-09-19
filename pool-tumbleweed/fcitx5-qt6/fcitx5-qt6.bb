SUMMARY = "Qt6 IM module for Fcitx5"
DESCRIPTION = "Qt6 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-qt6-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "e47b1b21e6684b2fc007c854fbc4de60dbf4e619710c5f56f648a3b1b1b0de7d76796b6d4b980f13a6f09211acf1cfb1d80cd7a3ca2a5c0cec78b2752357e20e"

RPROVIDES:${PN} += "fcitx-qt6 \
fcitx5-qt6 \
libfcitx-quickphrase-editor5.so \
libfcitx5platforminputcontextplugin.so"

RDEPENDS:${PN} += "fcitx5-qt-lang \
ld-linux-aarch64.so.1 \
libFcitx5Qt6DBusAddons.so.1 \
libFcitx5Qt6WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
