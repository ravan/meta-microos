SUMMARY = "Examples for the qt6-tools modules"
DESCRIPTION = "Examples for the qt6-tools modules."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-examples-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "575af5d5810f7ed01b8c607be53b4ccca3bef792bed9d3d144898e5055d0490608affaa20d3e179b294e094efa7777d933db05141c425e6bdae04410becbbe21"

RPROVIDES:${PN} += "qt6-tools-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Qml.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
