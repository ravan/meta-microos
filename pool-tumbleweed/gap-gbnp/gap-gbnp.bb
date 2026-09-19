SUMMARY = "GAP: computing Gröbner bases of noncommutative polynomials"
DESCRIPTION = "This package enhances GAP4 to support computing Gröbner bases of \
non-commutative polynomials with coefficients from a field \
implemented in GAP, and some variations, such as a weighted and \
truncated version and a tracing facility. \
 \
The word algorithm is interpreted loosely: in general, one cannot \
expect such an algorithm to terminate, as it would imply solvability \
of the word problem for finitely presented (semi)groups."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "gap-gbnp-1.1.0-1.5.noarch.rpm"
RPM_HASH = "624e50f39fad24db27d501a591f6d93e0bdaab6d8422b09ba3188c884b031a5a1b862656cd4e1b5d27f2c015288e7f6e80418d80c841affe4842292e80f55e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-gbnp"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc"

inherit rpm
