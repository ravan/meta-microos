SUMMARY = "Document Viewer, Mobile UI"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This contains the UI targeted at mobile devices with a \
touch screen."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "okular-mobile-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9230c551896927eb7fe73fdb9f1113543cc1e2689ce3f39d3d8de6ab400f577eed23742d6479428c8fd9f28f6a1d6cd216cecd872c7e95c55074ec92f9705d3f"

RPROVIDES:${PN} += "libokularplugin.so \
okular-mobile \
qt6qmlimport-org.kde.okular \
qt6qmlimport-org.kde.okular.2"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libOkular6Core.so.4 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
okular \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.okular.2"

inherit rpm
