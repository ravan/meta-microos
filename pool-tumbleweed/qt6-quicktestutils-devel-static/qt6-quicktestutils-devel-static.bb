SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktestutils-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "891defb081d5268ada40c819959b2ecf4b13da912099e199d5cacd96895ea24360432ee7d5d9d34a7c9ecb3b335ab55470e2889f3165c99dfaecb6ff7c41e5a9"

RPROVIDES:${PN} += "cmake-Qt6QuickTestUtilsPrivate \
qt6-quicktestutils-devel-static"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6QmlPrivate \
cmake-Qt6Quick \
cmake-Qt6QuickTest \
cmake-Qt6Test"

inherit rpm
