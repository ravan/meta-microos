SUMMARY = "Development files for jimtcl"
DESCRIPTION = "The jimtcl-devel package contains libraries and header files for \
developing applications that use jimtcl."
LICENSE = "BSD-2-Clause"

PV = "0.82"

RPM_NAME = "jimtcl-devel-0.82-1.11.aarch64.rpm"
RPM_HASH = "6524cc1e68a4850545c804c941d433d8cabc2ba0ae90d5827f6d23b0493b724c1316d53827c3789a54552f073b8b4737a4b1875f4f20512ee581bb54f2135e21"

RPROVIDES:${PN} += "jimtcl-devel \
pkgconfig-jimtcl"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
jimtcl \
libjim0-82 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
