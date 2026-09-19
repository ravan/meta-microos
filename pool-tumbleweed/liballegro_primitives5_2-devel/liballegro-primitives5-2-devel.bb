SUMMARY = "Development files for liballegro_primitives"
DESCRIPTION = "Development files needed to build applications which use liballegro_primitives."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_primitives5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "7feb030838d10eaf342bb49efcce89db0b321ab7869223ad9fd13cc3574ee95665ea752215a5aa7afa40ef816cf16de056636e67996124c0eb12f703a535eb16"

RPROVIDES:${PN} += "liballegro-primitives5-2-devel \
pkgconfig-allegro-primitives-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-primitives5-2 \
pkgconfig-allegro-5"

inherit rpm
