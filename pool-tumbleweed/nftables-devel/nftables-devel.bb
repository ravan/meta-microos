SUMMARY = "Development files for the nftables command line interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library. \
 \
This package contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.1.7"

RPM_NAME = "nftables-devel-1.1.7-1.1.aarch64.rpm"
RPM_HASH = "d8ac9ecc915bb0ccb5dc0967753edfdaf2e7a5d87accc1b6b9794a030b058cd9efbc5763997590bb544ce2990310ad57aedf1d0270e857a7385c85b01b1f0687"

RPROVIDES:${PN} += "nftables-devel \
pkgconfig-libnftables"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftables1"

inherit rpm
