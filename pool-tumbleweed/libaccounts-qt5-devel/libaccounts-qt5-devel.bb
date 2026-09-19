SUMMARY = "Development files for libaccounts-qt5"
DESCRIPTION = "This package contains the development files for the accounts-qt5 library."
LICENSE = "LGPL-2.1-only"

PV = "1.16git.20231124T162152~18557f7"

RPM_NAME = "libaccounts-qt5-devel-1.16git.20231124T162152~18557f7-1.10.aarch64.rpm"
RPM_HASH = "7f4d4d3a1c9b58a3718d7dc84e148881e690a1a1fff987bb8bd70c4c3fe90bb21a929c69ce40161589924515cffab4d185abeb47c1d4f3dc0bfc03d76338fd05"

RPROVIDES:${PN} += "cmake-AccountsQt5 \
libaccounts-qt5-devel \
pkgconfig-accounts-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Xml"

inherit rpm
