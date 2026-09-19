SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kirigami2-devel-5.116.0-1.13.aarch64.rpm"
RPM_HASH = "c9d8694f0fd7701164b4436d16efed6d9dc9e458a26cafe9b9fd209fd9bd082f3fec8d4577b5b3e8ec96d3991ffa688db5d81d9c94412f81d82eb413c3e96776"

RPROVIDES:${PN} += "cmake-KF5Kirigami2 \
kirigami2-devel"

RDEPENDS:${PN} += "kirigami2 \
libKF5Kirigami2-5"

inherit rpm
