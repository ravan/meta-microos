SUMMARY = "Examples for the qt6-remoteobjects modules"
DESCRIPTION = "Examples for the qt6-remoteobjects modules."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5dbd46871d628d412e96b1849e72d9bca44d2fc76d03a741344908a08b949f7bf944dd984788ee30f0866e04173e09923cc906e2e5ea3b9df67c0173734b9d3e"

RPROVIDES:${PN} += "qt6-remoteobjects-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtRemoteObjects"

inherit rpm
