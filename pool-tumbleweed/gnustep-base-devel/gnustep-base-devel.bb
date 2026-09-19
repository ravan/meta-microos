SUMMARY = "Devel package for the GNUstep Base Library"
DESCRIPTION = "This package contains include files for developing applications \
using the GNUstep Base Library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.31.1"

RPM_NAME = "gnustep-base-devel-1.31.1-2.8.aarch64.rpm"
RPM_HASH = "f0250987f4b7d936b23f33391e68967e06b857d135a80670e7213323b3ee9112c7fb2905b5379d092723d09db3e5853eaff3bdf7a36c9c336ebef7f1e20b6c86"

RPROVIDES:${PN} += "gnustep-base-devel \
pkgconfig-gnustep-base"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnustep-base \
libgnustep-base1-31"

inherit rpm
