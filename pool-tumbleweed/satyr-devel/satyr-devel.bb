SUMMARY = "Development libraries for satyr"
DESCRIPTION = "Development libraries and headers for satyr."
LICENSE = "GPL-2.0-or-later"

PV = "0.43"

RPM_NAME = "satyr-devel-0.43-5.6.aarch64.rpm"
RPM_HASH = "de010a169d8c03c3054fde42727a6ef14bcff35d2752ca155139ba01ce97f00c55db7164f041f27eb6bd1ff090178de48549434d41a95ba276cb417d38be31e3"

RPROVIDES:${PN} += "pkgconfig-satyr \
satyr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsatyr4 \
pkgconfig-json-c"

inherit rpm
