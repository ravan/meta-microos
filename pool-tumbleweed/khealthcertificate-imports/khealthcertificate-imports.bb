SUMMARY = "QML imports for using KHealthCertificate"
DESCRIPTION = "QML imports for using KHealthCertificate."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khealthcertificate-imports-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "aea2c68bf70f90c323f1662d1d70600f0f948b55cbcf2fe71077302c36187482922389f470e38c4d75420ae8a1256f63223ad24977c8d42047c8e56fe302875e"

RPROVIDES:${PN} += "khealthcertificate-imports \
libkhealthcertificateqmlplugin.so \
qt6qmlimport-org.kde.khealthcertificate \
qt6qmlimport-org.kde.khealthcertificate.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKHealthCertificate.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
