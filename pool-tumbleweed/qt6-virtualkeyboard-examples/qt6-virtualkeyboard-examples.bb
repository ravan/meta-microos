SUMMARY = "Examples for the qt6-virtualkeyboard modules"
DESCRIPTION = "Examples for the qt6-virtualkeyboard modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "064fe95057e92ea25f3be08a0ac0c774eebd8add094764b6286b0b440c2182cd571f3b947f8eef247ccf73428dc07e98e563df596908009b3e513bad9eb79360"

RPROVIDES:${PN} += "qt6-virtualkeyboard-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.VirtualKeyboard \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings \
qt6qmlimport-QtQuick.Window"

inherit rpm
