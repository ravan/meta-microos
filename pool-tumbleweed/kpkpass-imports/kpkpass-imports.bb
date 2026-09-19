SUMMARY = "QtQuick support for kpkpass"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations. This package provides QtQuick \
bindings for kpkpass, to use kpkpass in other QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kpkpass-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c29cc305eb4453d4e52eb7f80bd555aab8fc09a520528be9b9856f56bf3741246724e0ed4008b2ab503411f72c0e244d99ffbb2b3e92ed79eabe1b48a2c313b2"

RPROVIDES:${PN} += "kpkpass-imports \
libkpkpassqmlplugin.so \
qt6qmlimport-org.kde.pkpass \
qt6qmlimport-org.kde.pkpass.254"

RDEPENDS:${PN} += "kpkpass \
ld-linux-aarch64.so.1 \
libKPim6PkPass.so.6 \
libKPim6PkPass6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
