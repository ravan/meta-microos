SUMMARY = "Header files for libdisplay-info, an EDID library"
DESCRIPTION = "The library provides a set of low- and high-level functions \
for EDID and DisplayID. \
 \
This package contains headers for the library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "libdisplay-info-devel-0.3.0-2.5.aarch64.rpm"
RPM_HASH = "27fdfe4f83f8e907db4cc6f29b35e48debcf4237adbe2da85245f28ad14d782b7bb16278db8589e0d8e2badc55253f72fd41c37af1bc3a493f422529f687cde6"

RPROVIDES:${PN} += "libdisplay-info-devel \
pkgconfig-libdisplay-info"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdisplay-info3"

inherit rpm
