SUMMARY = "Generic map viewer"
DESCRIPTION = "Marble is a viewer of map data."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "marble-26.08.1-1.2.aarch64.rpm"
RPM_HASH = "5470c9595208a9054fd5487c0e9ecad921cd55a170836f5e0a8d370e568649fdf36ecfc6d7d40ed6b66f0225cb9c77be3c2d6c9a2f2138e4f028783c3f096cee"

RPROVIDES:${PN} += "libmarble-part.so \
libmarbledeclarative.so \
libmarbleimageprovider.so \
marble \
marble5 \
qt6qmlimport-org.kde.marble \
qt6qmlimport-org.kde.marble.2 \
qt6qmlimport-org.kde.marble.254 \
qt6qmlimport-org.kde.marble.6 \
qt6qmlimport-org.kde.marble.imageprovider \
qt6qmlimport-org.kde.marble.imageprovider.254 \
qt6qmlimport-org.kde.marble.imageprovider.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOGui.so.6 \
libKF6Parts.so.6 \
libKF6Runner.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Positioning.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6SerialPort.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libastro.so.1 \
libastro1 \
libc.so.6 \
libgps.so.32 \
libm.so.6 \
libmarblewidget-qt6-28 \
libmarblewidget-qt6.so.28 \
libphonon4qt6.so.4 \
libprotobuf.so.36.1.0 \
libshp.so.4 \
libstdc++.so.6 \
libz.so.1 \
marble-data \
marble-frontend"

inherit rpm
