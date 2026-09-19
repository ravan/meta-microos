SUMMARY = "Qt 5 QuickControl2 Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libQt5QuickControls2-5-5.15.19+kde5-1.2.aarch64.rpm"
RPM_HASH = "0b4981891c61a1b028e8616b6719ec776978613cccd65b3c119b6cceae8f87fc1fd244e31c7fa06cf727e995ba5bf5d04bfda1299cda3d82432c14ea77c4e670"

RPROVIDES:${PN} += "libQt5QuickControls2-5 \
libQt5QuickControls2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTemplates2.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
