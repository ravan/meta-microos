SUMMARY = "KDE PIM Libraries: Identity Management - development files"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications that make use of multiple email identities."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kidentitymanagement-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "48430afaed3881d4885666352f8ff92584735323f60c167a5fae8f41c02d4b29cc32bdd8f3a909747990a9584afdf8679350de8940c1b946bdf0a0fb57c83752"

RPROVIDES:${PN} += "cmake-KPim6IdentityManagementCore \
cmake-KPim6IdentityManagementQuick \
cmake-KPim6IdentityManagementWidgets \
kidentitymanagement-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
cmake-KPim6TextEdit \
libKPim6IdentityManagementCore6 \
libKPim6IdentityManagementQuick6 \
libKPim6IdentityManagementWidgets6"

inherit rpm
