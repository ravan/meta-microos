SUMMARY = "Qt 6 WebChannel QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebChannel module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webchannel-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2b7d686aab1cc64b1bd63ecaae1b62b508fd6ec961e3c44646b5bcff6a6d8e8e6312d06c158c9554c6676d3f97b9fa40ca9bcf5e3f3fa3c24ba4d0920c19ec9a"

RPROVIDES:${PN} += "libwebchannelquickplugin.so \
qt6-webchannel-imports \
qt6qmlimport-QtWebChannel \
qt6qmlimport-QtWebChannel.1 \
qt6qmlimport-QtWebChannel.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebChannelQuick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
