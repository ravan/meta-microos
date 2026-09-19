SUMMARY = "QtQuick bindings for configuration entities"
DESCRIPTION = "KConfigQml provides QtQuick bindings to KConfig, which allows using the library with \
QML."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ConfigQml6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5b415fe7f9ffba56ae0dd69ae53d5b014d89d2a58ab4590faa89bca59f3098052dd6bbef155348b679f0a62754a28e39b11c92e13c1b38e26ca6abb30a255ea4"

RPROVIDES:${PN} += "libKF6ConfigQml.so.6 \
libKF6ConfigQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigCore6 \
libKF6ConfigGui.so.6 \
libKF6ConfigGui6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
