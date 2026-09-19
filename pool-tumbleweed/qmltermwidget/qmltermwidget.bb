SUMMARY = "QML port of qtermwidget"
DESCRIPTION = "This project provides a Unicode-enabled, embeddable QML widget for \
using as a built-in console (or terminal emulation widget)."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "qmltermwidget-0.2.0-2.26.aarch64.rpm"
RPM_HASH = "31a59b65d26b6357a601e8e9b34c6f6305db901ef165976370beac0aa191b6c4f1e6ad0447d149d28e2247f23c0cc8c7ee13b676551855de21942b4b67eea445"

RPROVIDES:${PN} += "libqmltermwidget.so \
qmltermwidget \
qt5qmlimport-QMLTermWidget.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt5qmlimport-QMLTermWidget.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
