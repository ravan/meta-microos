SUMMARY = "Development files for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
This package contains header files and libraries needed to develop \
application that use molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "molsketch-devel-0.8.4-1.1.noarch.rpm"
RPM_HASH = "0ac7e4abf8feeeab3d2024ddd94e332314db6ab8e8b14a6e491f4b65740d619d52159b0be626826256276e87c2fe8eb5720e80b746921d9057829b41ccdf4991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmolsketch1 \
molsketch-devel"

RDEPENDS:${PN} += "libqt5-qttools"

inherit rpm
