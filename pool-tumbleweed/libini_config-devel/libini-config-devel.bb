SUMMARY = "Development files for libini_config"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libini_config-devel-2.0.0-29.3.aarch64.rpm"
RPM_HASH = "2764bb09985db826c2421fef979643e796d016f5459712dff4dfc24ae1c41fde6e5e87fc529c7da41dd0269c502568a4891a9ef73f9a6108b0640f917b533700"

RPROVIDES:${PN} += "libini-config-devel \
libref-array-devel \
pkgconfig-ini-config"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libini-config8"

inherit rpm
