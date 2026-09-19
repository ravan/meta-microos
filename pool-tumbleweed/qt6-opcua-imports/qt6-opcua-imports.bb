SUMMARY = "Qt 6 OpcUa QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 OpcUa module."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ab4bf57d6a6c1ab04c747419261f77b7cfebbccdce1c4dfff203d755ce7cddf5de2d2997c9545ee98da7fcb2c72b2fd540b8ba81ec8a3ce4e7c702f582bc6cc6"

RPROVIDES:${PN} += "libdeclarativeopcuaplugin.so \
qt6-opcua-imports \
qt6qmlimport-QtOpcUa \
qt6qmlimport-QtOpcUa.1 \
qt6qmlimport-QtOpcUa.5 \
qt6qmlimport-QtOpcUa.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DeclarativeOpcua.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-opcua"

inherit rpm
