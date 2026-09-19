SUMMARY = "QML imports for kcontacts"
DESCRIPTION = "This package provides a QML module that exposes some of the kcontacts classes \
as QML value types."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcontacts-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "74db085ab71cd4ae0a6cb4f7c2e02657bb55f2c323a561ad379835ffa089c585fe9f7b794c86b008a3bead05569d55bb98df85bd09143ab5e271c4865f985108"

RPROVIDES:${PN} += "kf6-kcontacts-imports \
libkcontactsqml.so \
qt6qmlimport-org.kde.contacts \
qt6qmlimport-org.kde.contacts.1 \
qt6qmlimport-org.kde.contacts.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
