SUMMARY = "Shared library for rssguard"
DESCRIPTION = "Shared library for rssguard to be used by external plugins."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only"

PV = "5.2.5"

RPM_NAME = "librssguard-5_2_5-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "7a4b7ddd88a69467e59e5f642c2c54ef585107f65a0ae261ffd8902dc8c22af5b2bdccf348a30c10b479f954f325ed3f7ededd201de7cc49c6fe74480d8aad67"

RPROVIDES:${PN} += "librssguard-5-2-5 \
librssguard-5.2.5.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sql.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
