SUMMARY = "QML imports for kpeople"
DESCRIPTION = "This package provides support to use KPeople with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpeople-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b3a9d792101c84018b7c2580a39553f33878e2c7fb8f4c49d4ca4dc7e530079ebd9c9600e9806dffc5f81d25ab5842894f9c5866b3c8b6590892b3948af111cf"

RPROVIDES:${PN} += "kf6-kpeople-imports \
libKF6PeopleDeclarative.so \
qt6qmlimport-org.kde.people \
qt6qmlimport-org.kde.people.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6People.so.6 \
libKF6People6 \
libKF6PeopleBackend.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
