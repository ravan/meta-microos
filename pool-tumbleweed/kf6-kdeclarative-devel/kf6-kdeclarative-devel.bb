SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdeclarative-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "48485c74335c55a7f1e1a5815af104a14eb1e80a879de740abd5a7df182c4762b10f6e801b373659ee1c6ce5c932fe5b039ca8197dadb01a5aeeb03ec8a9e54f"

RPROVIDES:${PN} += "cmake-KF6Declarative \
kf6-kdeclarative-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6CoreAddons \
cmake-Qt6Quick \
libKF6CalendarEvents6"

inherit rpm
