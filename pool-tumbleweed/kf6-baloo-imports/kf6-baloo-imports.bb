SUMMARY = "QML components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains QML imports."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-baloo-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "10e1cf694181834e59d76e6b9095604cab3404baf549161f89c7bca9cccfd8f710b28d39b8c06773f335705146971dc87a00070795fdb1b2e5740d3f4ed06084"

RPROVIDES:${PN} += "kf6-baloo-imports \
libbaloomonitorplugin.so \
libbalooplugin.so \
qt6qmlimport-org.kde.baloo \
qt6qmlimport-org.kde.baloo.0 \
qt6qmlimport-org.kde.baloo.experimental \
qt6qmlimport-org.kde.baloo.experimental.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6BalooEngine.so.6 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
