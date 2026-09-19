SUMMARY = "Qt 6 Graphs QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Graphs module"
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-graphs-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "78134beb0d11ee795fdc6dc393503bc63979cd42d583413020ddc58791ba2d26796db220a8c8d06550dbc4a1dabf098f5b0113eb9035daba038e35123ed2ccc0"

RPROVIDES:${PN} += "libgraphsplugin.so \
qt6-graphs-imports \
qt6qmlimport-QtGraphs \
qt6qmlimport-QtGraphs.1 \
qt6qmlimport-QtGraphs.2 \
qt6qmlimport-QtGraphs.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Graphs.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
