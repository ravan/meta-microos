SUMMARY = "Development files for the libblockdev-smart plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libblockdev-smart plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_smartmontools-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "3cd0fcbc3e7126e325b20576355b2d07053bd6190ea1792b2269b1b00fefa684309acd7ed9ce99a71a65a5acf44de16c9f5ea82fd92c4b4713c3725328fbfdeb"

RPROVIDES:${PN} += "libbd-smartmontools-devel \
libblockdev-smartmontools-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-smartmontools3 \
libbd-utils-devel"

inherit rpm
