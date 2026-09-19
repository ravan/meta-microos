SUMMARY = "Development files for libqimageblitz5"
DESCRIPTION = "This package contains development files for libqimageblitz5."
LICENSE = "BSD-2-Clause"

PV = "0.0.6+svn1515099"

RPM_NAME = "libqimageblitz5-devel-0.0.6+svn1515099-4.25.aarch64.rpm"
RPM_HASH = "b500bc6caef3bf8e361d7c9c88f436c1c12ec30aca048363189883e34038510249c90a4726f77b5714a3e8334d6dbebf47d393ade06992f27e66ff8d6bf24246"

RPROVIDES:${PN} += "libqimageblitz5-devel \
pkgconfig-qimageblitz5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqimageblitz5-1 \
libqimageblitz5.so.1 \
libstdc++.so.6 \
pkgconfig-Qt5Gui"

inherit rpm
