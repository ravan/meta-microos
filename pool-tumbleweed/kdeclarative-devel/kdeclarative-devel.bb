SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kdeclarative-devel-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "3c7186647ed30c61a0f337467539a91d4006a488bc0ce99d3c16c835fee33d668f5c4e150671d6d9e964efc517e0180f9aee9b6573b2d8f971a823f5668845f0"

RPROVIDES:${PN} += "cmake-KF5Declarative \
kdeclarative-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5Package \
cmake-Qt5Qml \
kdeclarative-components \
libKF5CalendarEvents5 \
libKF5Declarative5 \
libKF5QuickAddons5"

inherit rpm
