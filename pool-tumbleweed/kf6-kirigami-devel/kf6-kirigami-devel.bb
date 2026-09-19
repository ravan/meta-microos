SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kirigami-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "99695df9348ae4a768b0aec4ba9352887ed9b0bb77df9574217d6448bc6d71c114e35241aebade1c71a3358700895607e7bf940e4d9d36a65cfdcf78fb2aa97b"

RPROVIDES:${PN} += "cmake-KF6Kirigami \
cmake-KF6Kirigami2 \
cmake-KF6KirigamiPlatform \
kf6-kirigami-devel"

RDEPENDS:${PN} += "cmake-Qt6Concurrent \
cmake-Qt6Core \
cmake-Qt6Qml \
cmake-Qt6Quick \
libKirigamiPlatform6"

inherit rpm
