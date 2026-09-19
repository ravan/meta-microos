SUMMARY = "Qt5 IM module for Fcitx5"
DESCRIPTION = "Qt5 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-qt5-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "8350f187d360ca5163784e61b0a97119e12aa593214af70db9fa870bf19abc440c0b64dfe68fa71f642d5e84a119a226d452c099e66da2f1d33f5b5f314c2123"

RPROVIDES:${PN} += "fcitx-qt5 \
fcitx5-qt5 \
libfcitx5platforminputcontextplugin.so"

RDEPENDS:${PN} += "fcitx5-qt-lang \
ld-linux-aarch64.so.1 \
libFcitx5Qt5DBusAddons.so.1 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
