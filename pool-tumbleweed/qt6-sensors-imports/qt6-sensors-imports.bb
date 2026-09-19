SUMMARY = "Qt 6 Sensors QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Sensors module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3eef550cdf9127115b6e49b0e437afefb2e979927adfdb4902655ca2d3dbbfa439b00cfc7e900463788a59a1a663cc733cd37fccf7723beed35c21d41161f9ca"

RPROVIDES:${PN} += "libsensorsquickplugin.so \
qt6-sensors-imports \
qt6qmlimport-QtSensors \
qt6qmlimport-QtSensors.5 \
qt6qmlimport-QtSensors.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6SensorsQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
