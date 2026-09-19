SUMMARY = "Development files for building SPICE-server"
DESCRIPTION = "Development files for building SPICE-server. \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "libspice-server-devel-0.16.0-1.6.aarch64.rpm"
RPM_HASH = "aa8bd84ffb68a67c8b666822540af23e105c3f8d23620f54332befed4449c4a78336c61e27a5f5c7a10e6273e5111138eb48f90a2b04e596e83f142307a32652"

RPROVIDES:${PN} += "libspice-server-devel \
pkgconfig-spice-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspice-server1 \
pkgconfig-glib-2.0 \
pkgconfig-libcacard \
pkgconfig-openssl \
pkgconfig-pixman-1 \
pkgconfig-spice-protocol"

inherit rpm
