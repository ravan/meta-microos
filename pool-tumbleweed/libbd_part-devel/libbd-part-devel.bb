SUMMARY = "Development files for the libblockdev-part plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_part plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_part-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "b66ff2fb285b6636c3062b3c5a2d911dddd00fe1def87fc5448c8bc610b958c9af1327f8617e2d20cebd24b14ffa456cc9b5af58e4ae26920dcc30969b71cfab"

RPROVIDES:${PN} += "libbd-part-devel \
libblockdev-part-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-part3 \
libbd-utils-devel"

inherit rpm
