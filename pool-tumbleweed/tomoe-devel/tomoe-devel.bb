SUMMARY = "Header files for the Tomoe handwriting recognition engine"
DESCRIPTION = "Header files for the Tomoe handwriting recognition engine."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-devel-0.6.0-51.18.aarch64.rpm"
RPM_HASH = "643756bae7bfd176e85891fef514b1ccc980bd393cfefa0a09f46c52fdf7bf88c21830ccf0691d65ceebf1f3dce1ee3e8e628140e63fde18f85ac122e18209a3"

RPROVIDES:${PN} += "pkgconfig-tomoe \
tomoe-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
pkgconfig-glib-2.0 \
tomoe"

inherit rpm
