SUMMARY = "Examples for the qt6-opcua modules"
DESCRIPTION = "Examples for the qt6-opcua modules."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2371e866f1beeb4bbaae997a8a5e5a557dbf146efe0a5c56a6e50bc860067cca04c0d6a9bf0e5b016643ecf66d5c4beb63e3aa0b63d05de2101e30a5cf8e19a0"

RPROVIDES:${PN} += "qt6-opcua-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpcUa.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtOpcUa \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
