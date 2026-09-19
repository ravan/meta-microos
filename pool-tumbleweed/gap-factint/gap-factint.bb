SUMMARY = "GAP: Advanced Methods for Factoring Integers"
DESCRIPTION = "FactInt is a GAP 4 package which provides routines for factoring \
integers, in particular: \
 \
  * Pollard's p-1 \
  * Williams' p+1 \
  * Elliptic Curves Method (ECM) \
  * Continued Fraction Algorithm (CFRAC) \
  * Multiple Polynomial Quadratic Sieve (MPQS) \
 \
It also provides access to  Richard P. Brent's tables  of factors of \
integers of the form b^k +/- 1."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "gap-factint-1.7.0-1.1.noarch.rpm"
RPM_HASH = "566e14ccd9ca0c45bc3cb0f3403bbb5f5fd20f9dc24e047812673843fab167e195e6a47b73053a5d56ebdfabbc7fd296f98ee365bc9cb57a12861b61add383ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-factint"

RDEPENDS:${PN} += "gap-core"

inherit rpm
