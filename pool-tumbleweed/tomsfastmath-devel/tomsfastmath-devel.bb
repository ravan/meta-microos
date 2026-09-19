SUMMARY = "Development headers for libtfm1"
DESCRIPTION = "Contains development headers for libtfm1"
LICENSE = "SUSE-Public-Domain | WTFPL"

PV = "0.13.1"

RPM_NAME = "tomsfastmath-devel-0.13.1-1.18.aarch64.rpm"
RPM_HASH = "d79a4c47f6a433196ce0932e1defa7689a9831d0066a5fcd97135b06f2d2c3c376e77c046722edce2fed1c4c6afbdaf713c153ca503be25d2efebaf525e0fa64"

RPROVIDES:${PN} += "pkgconfig-tomsfastmath \
tomsfastmath-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtfm1"

inherit rpm
