SUMMARY = "Development files for clxclient"
DESCRIPTION = "Development files for clxclient including headers and libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.2"

RPM_NAME = "clxclient-devel-3.9.2-3.9.aarch64.rpm"
RPM_HASH = "3a4ca51a28a75894b9ef74424a861465bbcde223e478f3d11430dea13cea6eb2a84786b583a868c81505d3b7fbf2621c5ad46f356d6f0c369c34c31a979467a2"

RPROVIDES:${PN} += "clxclient-devel"

RDEPENDS:${PN} += "clthreads-devel \
libclxclient3 \
pkgconfig-freetype2 \
pkgconfig-x11 \
pkgconfig-xft \
pkgconfig-xproto"

inherit rpm
