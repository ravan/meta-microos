SUMMARY = "Development files for libt3config, a library for reading/writing config files"
DESCRIPTION = "The libt3config library provides functions for reading and writing \
simple structured configuration files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3config."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "libt3config-devel-1.0.0-1.25.aarch64.rpm"
RPM_HASH = "3e30c73c83b24030c246eb058f5a8ac3766aeec2f0a25229e6e575808f83ca669c5a7652602f1499e6fe360ba3e206c4bf85fb2e0528c160412080bba9eeef23"

RPROVIDES:${PN} += "libt3config-devel \
pkgconfig-libt3config"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3config0"

inherit rpm
