SUMMARY = "Qt Development Kit"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains qtimageformats. \
 \
You need this package, if you want to compile programs with qtimageformats."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtimageformats-devel-5.15.19+kde2-1.3.aarch64.rpm"
RPM_HASH = "53622dc713d4af7c3e10df0d39fca6e89f5e31b7f3563904d2e085b000761238ca3afbcd80e82ad2cc4adb0b113b98d30b39684106be4cb3e552ddc5ba7bb4a3"

RPROVIDES:${PN} += "libqt5-qtimageformats-devel"

RDEPENDS:${PN} += "libmng-devel \
libqt5-qtimageformats \
libtiff-devel \
pkgconfig-Qt5Gui \
pkgconfig-libwebp"

inherit rpm
