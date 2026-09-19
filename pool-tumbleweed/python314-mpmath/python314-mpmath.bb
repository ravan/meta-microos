SUMMARY = "Python library for arbitrary-precision floating-point arithmetic"
DESCRIPTION = "Mpmath is a pure-Python library for multiprecision floating-point \
arithmetic. It provides a set of transcendental functions, \
unlimited exponent sizes, complex numbers, interval arithmetic, \
numerical integration and differentiation, root-finding, linear \
algebra, and others. Almost any calculation can be performed just \
as well at 10-digit or 1000-digit precision, and in many cases, mpmath \
implements algorithms that scale well for high precision work. \
If available, mpmath will (optionally) use gmpy to speed up high \
precision operations."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-mpmath-1.3.0-3.4.noarch.rpm"
RPM_HASH = "8753419726b1cd6142767d14897dbbaab79475d2c9ff24e42596d4819e08df77291106131d1dc24e54dfc613fdcda034f72e4fdfac56dbb5070b46f1b7f1068c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mpmath \
python314-mpmath \
python3dist-mpmath"

RDEPENDS:${PN} += "python-abi \
python314 \
python314-gmpy2"

inherit rpm
