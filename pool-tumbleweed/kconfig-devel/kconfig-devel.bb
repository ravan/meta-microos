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
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kconfig-devel-5.116.0-2.8.aarch64.rpm"
RPM_HASH = "bf9bc56aecba20007d68c3a93fcfcfb89880b6c2eb4f3b4adb6e432b5d0fa61c0ded395f05e69aa639459fff7a36a56dcfc58218c280af11b53a743a2175636c"

RPROVIDES:${PN} += "cmake-KF5Config \
kconfig-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5Xml \
kconf-update5 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore5 \
libKF5ConfigGui5 \
libKF5ConfigQml5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
