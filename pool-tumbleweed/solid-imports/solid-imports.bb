SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "solid-imports-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "6de10481edac7e5bc42df8341799a0e25b8cc698107a60b56aedd39d466bbb9c7d1aa1de90c277978adcd9527a448995dd04ca16598ad0278af931bc1f5ae14e"

RPROVIDES:${PN} += "libsolidextensionplugin.so \
qt5qmlimport-org.kde.solid.1 \
solid-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
