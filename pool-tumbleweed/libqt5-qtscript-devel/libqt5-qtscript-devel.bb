SUMMARY = "Development files for the Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Script5."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtscript-devel-5.15.19-1.3.aarch64.rpm"
RPM_HASH = "92c4feab8048053fc3752af8bcbe0328f536bf8019b17e417d3f5c6868b79cd9c5d15c66445f86bd6d5d54dbd1af26ac6b0a873c1de3cb556202aee93b96431a"

RPROVIDES:${PN} += "cmake-Qt5Script \
cmake-Qt5ScriptTools \
libQt5Script-devel \
libqt5-qtscript-devel \
pkgconfig-Qt5Script \
pkgconfig-Qt5ScriptTools"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Script5 \
pkgconfig-Qt5Core"

inherit rpm
