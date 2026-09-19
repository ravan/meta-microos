SUMMARY = "Header files for the a52dec library"
DESCRIPTION = "Header files and static library for the a52dec library. \
Install this package if you want to compile programs using the library."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "liba52-devel-0.8.0-1.12.aarch64.rpm"
RPM_HASH = "ba3188a80bba392f2a26b5c7a64b68765e5970b85ccb19bb208a71eac135ae3791773dec242f61aafafb561b72a6e32351da2d86f3e5333d9bb93a667e82191b"

RPROVIDES:${PN} += "a52dec-devel \
liba52-devel \
liba52dec-devel \
pkgconfig-liba52"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liba52-0"

inherit rpm
