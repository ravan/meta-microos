SUMMARY = "Library for Mahjongg tiles: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop games that uses Mahjongg tiles."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkmahjongg-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3d431f9574ff6c2ea93e14741be7f55607f1162f62ec5d28da3b849a10db7ac5edd00b9b6488b1fba0977c3c0b7c06131cc0f3dc3ddaf5dac89d84f6cb6be37b"

RPROVIDES:${PN} += "cmake-KMahjongglib6 \
libkmahjongg-devel \
libkmahjongg-kf5-devel"

RDEPENDS:${PN} += "cmake-KF6ConfigWidgets \
cmake-Qt6Gui \
libKMahjongg6"

inherit rpm
