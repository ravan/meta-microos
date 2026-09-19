SUMMARY = "Polynomial and Elliptic Curve Data for the PARI CAS"
DESCRIPTION = "This package is needed by the 'ellap' function of the PARI CAS for \
large primes. The second one is a much smaller version that should be \
suitable for primes up to 350 bits. These polynomials were extracted \
from the ECHIDNA databases and computed by David R. Kohel."
LICENSE = "GPL-2.0-or-later"

PV = "20090618"

RPM_NAME = "pari-seadata-20090618-10.11.noarch.rpm"
RPM_HASH = "b944d45fae21c58c7f30b9dccf3d2fb91a56faddcbe520c76e7a4fdd6486043a30b86584c4f5e2bf2f07c322f2d98caa7c2ee7fa8cbe5c1e176d042643ef18b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-seadata"

RDEPENDS:${PN} += ""

inherit rpm
