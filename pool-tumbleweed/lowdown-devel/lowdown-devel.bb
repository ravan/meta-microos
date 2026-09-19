SUMMARY = "Simple markdown translator"
DESCRIPTION = "lowdown is a fork of hoedown, although the parser and front-ends have changed \
significantly."
LICENSE = "ISC"

PV = "3.1.1"

RPM_NAME = "lowdown-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "4f2790fc6030e11693d22eff69937ea98e23e6a33117897a7dd84d4112fbca782e117bc4eb4fa9a11a50209ccf9a6d751d2f92823b5e572b8e235a3feef698f1"

RPROVIDES:${PN} += "lowdown-devel \
pkgconfig-lowdown"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblowdown4"

inherit rpm
