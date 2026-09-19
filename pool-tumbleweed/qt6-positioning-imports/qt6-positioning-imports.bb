SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "64cf1a694e1bab927994bfe736b065ef15676b689725888ee6c8d5c40df4501e7454a59d6f31f1d6d60d41c39f027ab9774f1e4c8fc02b544b15ccfc72b67aca"

RPROVIDES:${PN} += "libpositioningquickplugin.so \
qt6-location-imports \
qt6-positioning-imports \
qt6qmlimport-QtPositioning \
qt6qmlimport-QtPositioning.2 \
qt6qmlimport-QtPositioning.5 \
qt6qmlimport-QtPositioning.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Positioning.so.6 \
libQt6PositioningQuick.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
