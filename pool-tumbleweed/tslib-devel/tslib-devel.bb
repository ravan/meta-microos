SUMMARY = "Development files for tslib, a touchscreen panel event layer"
DESCRIPTION = "Devel package for tslib. Tslib is an abstraction layer for touchscreen panel events."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.24"

RPM_NAME = "tslib-devel-1.24-1.4.aarch64.rpm"
RPM_HASH = "911a4cc542a9837c83bfc0b2d4eeda4620a584d34cd55eabb3a86a1f9a025fd859e0a84581d6d29a87671b07ba14ff84accc2bed151f278cb32d92b01d0990d7"

RPROVIDES:${PN} += "pkgconfig-tslib \
tslib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
tslib \
tslib-plugins"

inherit rpm
