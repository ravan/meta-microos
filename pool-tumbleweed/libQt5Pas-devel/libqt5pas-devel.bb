SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "The qt5pas-devel package contains libraries and header files for \
developing applications that use qt5pas."
LICENSE = "LGPL-3.0-only"

PV = "4.8"

RPM_NAME = "libQt5Pas-devel-4.8-1.2.aarch64.rpm"
RPM_HASH = "e9b70276e62f8d89342013bd13f566b16eedb0bdf8e318189ed8c45adbf6573ce2d34c87d8295920d0f2fa9ebccc55a5bcefbde4c53b56e906d6947ab6d450d4"

RPROVIDES:${PN} += "libQt5Pas-devel"

RDEPENDS:${PN} += "libQt5Pas1"

inherit rpm
