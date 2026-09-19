SUMMARY = "X On-Screen Display library development files"
DESCRIPTION = "Development headers and libraries for xosd package"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.14"

RPM_NAME = "xosd-devel-2.2.14-1.11.aarch64.rpm"
RPM_HASH = "20a528a5b0bd4dcccf66586d2a3f9904eb870ba1a502202a72dda2c25936aafa7e071d76c57ac4855811b26194c4b338de34ecc7f61ce40f1f6e0406a8919efb"

RPROVIDES:${PN} += "xosd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
xosd"

inherit rpm
