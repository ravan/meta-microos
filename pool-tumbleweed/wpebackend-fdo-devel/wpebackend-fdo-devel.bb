SUMMARY = "Development files for wpebackend-fdo"
DESCRIPTION = "The wpebackend-fdo-devel package contains libraries, build data, and \
header files for developing applications that use wpebackend-fdo."
LICENSE = "BSD-2-Clause"

PV = "1.16.1"

RPM_NAME = "wpebackend-fdo-devel-1.16.1-1.5.aarch64.rpm"
RPM_HASH = "8a88146ea6f2811a8ea241a933f501971cfb30b1c1500df5918bae035b566bc63ab282b6ae94c152c41bc4baaa4cbbb43f01fbfc78862d7594552ff966c35c86"

RPROVIDES:${PN} += "pkgconfig-wpebackend-fdo-1.0 \
wpebackend-fdo-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWPEBackend-fdo-1-0-1 \
pkgconfig-wpe-1.0"

inherit rpm
