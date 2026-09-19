SUMMARY = "Development files for quazip-qt5"
DESCRIPTION = "The quazip-qt5-devel package contains libraries and header files for \
developing applications that use quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "quazip-qt5-devel-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "37832896d54628ba3a4d903401cba8b7e4fc6aa4f346369d976f51ad4ad51decded39ee767b4af9243c67fcab91885c7742700e06a3826a9eeb8778b2e780234"

RPROVIDES:${PN} += "cmake-QuaZip-Qt5 \
libquazip-qt5-devel \
pkgconfig-quazip1-qt5 \
quazip-devel \
quazip-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
libquazip1-qt5-1-7 \
pkgconfig-Qt5Core \
pkgconfig-bzip2 \
pkgconfig-zlib"

inherit rpm
