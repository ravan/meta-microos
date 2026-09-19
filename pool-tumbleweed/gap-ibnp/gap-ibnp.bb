SUMMARY = "GAP: Involutive Bases for Noncommutative Polynomials"
DESCRIPTION = "The IBNP package provides methods for computing an involutive \
(Groebner) basis B for an ideal J over a polynomial ring R in both \
the commutative and noncommutative cases. Secondly, methods are \
provided to involutively reduce a given polynomial to its normal form \
in R/J."
LICENSE = "GPL-3.0-or-later"

PV = "0.18"

RPM_NAME = "gap-ibnp-0.18-1.2.noarch.rpm"
RPM_HASH = "033e3aa6e7174d27e07e8bcd5de71ddeca82e35836012589729e0ee90210df873688bd02b3384b38cfcdd1e39987b3330d8008ef075c79d7ca52144288194657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-ibnp"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-gbnp \
gap-utils"

inherit rpm
