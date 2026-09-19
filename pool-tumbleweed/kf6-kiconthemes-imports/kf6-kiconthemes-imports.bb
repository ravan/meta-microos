SUMMARY = "QML Imports for kiconthemes"
DESCRIPTION = "QML Bindings for the kiconthemes framework."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kiconthemes-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5741e1f7b6aa16076215169c5ad8ac8bd3e3ed91192f31a63a2e7f82d9667e2b7269c4ce27e0801b1ec150c0b01923e7e83fb80fc958f0da9c1aa22c3f2d6b80"

RPROVIDES:${PN} += "kf6-kiconthemes-imports \
libiconthemesplugin.so \
qt6qmlimport-org.kde.iconthemes \
qt6qmlimport-org.kde.iconthemes.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6IconWidgets.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
