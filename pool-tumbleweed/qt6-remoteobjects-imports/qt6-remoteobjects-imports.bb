SUMMARY = "Qt 6 RemoteObjects QML files"
DESCRIPTION = "QML files and plugins for the Qt 6 RemoteObjects module"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4fd45d03f8b0316cc290e2158463a905b2b26d32f1b9aaeccd0797a45d093bbe25ca016069a2e6eabd62b0a79400a75015e73b2126c168ac03790cea21fb1039"

RPROVIDES:${PN} += "libdeclarative-remoteobjectsplugin.so \
qt6-remoteobjects-imports \
qt6qmlimport-QtRemoteObjects \
qt6qmlimport-QtRemoteObjects.5 \
qt6qmlimport-QtRemoteObjects.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjectsQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
