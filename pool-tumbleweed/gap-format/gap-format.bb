SUMMARY = "GAP: Computation with formations of finite solvable groups"
DESCRIPTION = "This GAP package provides functions for computing with formations of \
finite solvable groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "gap-format-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "02d9ca1882f6ed74922d86921ae2818907e9ed2eac1b365a524403ee0119a5d20ce12d7ff5791e42bd57d277dafa0856f280fcbf5ccbf70b2803767edaf966a5"

RPROVIDES:${PN} += "gap-format"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core"

inherit rpm
