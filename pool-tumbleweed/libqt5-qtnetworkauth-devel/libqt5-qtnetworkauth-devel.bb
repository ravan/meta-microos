SUMMARY = "Development files for the Qt5 NetworkAuth Library"
DESCRIPTION = "Qt Network Authorization provides a set of APIs that enable Qt \
applications to obtain limited access to online accounts and HTTP \
services without exposing users' passwords. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5NetworkAuth5."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtnetworkauth-devel-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "5222f32b10632fee4e7f260a85ef46f309397470ef037cd0aa80c4a9f4feced257b232426beb94cbb491725a7e74c5a24d1997f55fbe130a746289fa51fe02d8"

RPROVIDES:${PN} += "cmake-Qt5NetworkAuth \
libqt5-qtnetworkauth-devel \
pkgconfig-Qt5NetworkAuth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5NetworkAuth5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
