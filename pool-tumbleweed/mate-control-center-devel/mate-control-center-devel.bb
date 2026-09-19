SUMMARY = "Header files for MATE Control Center"
DESCRIPTION = "The control center is MATE's main interface for configuration of various \
aspects of your desktop. \
 \
This package provides MATE control center development files."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-control-center-devel-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "fd4d55c0d3900326a1ed0e5529638bdd6caae65a9ff4d06d7d01cde6183d7b04411e876a4f55884ceeed2b2bbe7b85fa2aa3455d4cb38e5b720e58d2c951f684"

RPROVIDES:${PN} += "mate-control-center-devel \
pkgconfig-mate-default-applications \
pkgconfig-mate-keybindings"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
