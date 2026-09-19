SUMMARY = "Development files for the LAME MP3 encoder"
DESCRIPTION = "Contains the header files for use with LAME's encoding library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "libmp3lame-devel-3.100-5.15.aarch64.rpm"
RPM_HASH = "f2282f672c43ad096e4d50f455b0cbd02a6c03b2be88621f5edb70f942018c9c7659de925eb41ef7d04b8f67a9499a216a17898ef9b2ad85076327e8efa01960"

RPROVIDES:${PN} += "libmp3lame-devel \
pkgconfig-lame \
pkgconfig-libmp3lame"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmp3lame0"

inherit rpm
