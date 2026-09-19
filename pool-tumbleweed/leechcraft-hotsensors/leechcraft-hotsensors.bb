SUMMARY = "LeechCraft Temperature Sensors Module"
DESCRIPTION = "This package provides a temperature sensors subplugin (a quark) \
for LeechCraft SideBar."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-hotsensors-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "669991a3779ffa4894127682338d06d7366d6401cfa02000f49c82c7d1db66f3779eed8241d6db916733c57c2fa0aa6a89a1cf972894310998c26b08cca074f6"

RPROVIDES:${PN} += "leechcraft-hotsensors \
libleechcraft-hotsensors.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-sb \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libsensors.so.4 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Window"

inherit rpm
