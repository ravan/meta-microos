SUMMARY = "Development files for the Osmocom muxed audio library"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-netif."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmonetif-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "30cc4e7f4ceedf8f5be91a437e61f061e4f2ab82df9fff4b56f5b3859b40f2f3415b5c518228381ff60f14b1c5d2bfeda87119b459ce8cf82895565b6011b787"

RPROVIDES:${PN} += "libosmonetif-devel \
pkgconfig-libosmo-netif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmonetif11"

inherit rpm
