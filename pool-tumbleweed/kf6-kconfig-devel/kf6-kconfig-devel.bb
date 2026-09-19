SUMMARY = "KConfig Development files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves. It features: \
 \
- centralized definition: define your configuration in an XML file and use \
`kconfig_compiler` to generate classes to read and write configuration entries. \
 \
- lock-down (kiosk) support. \
 \
KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kconfig-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "3412a5162785ad75f76e9325abd959e14eab424b2d32318d3ac9ee7b030387f06cbaf43b3d66ae5a3a54e1362d9e8224597369a1c2377e3cac184b562bcb2791"

RPROVIDES:${PN} += "cmake-KF6Config \
kf6-kconfig-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6DBus \
cmake-Qt6Gui \
cmake-Qt6Qml \
kconf-update6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore6 \
libKF6ConfigGui6 \
libKF6ConfigQml6 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
