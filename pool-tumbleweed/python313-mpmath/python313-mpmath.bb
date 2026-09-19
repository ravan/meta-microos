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

RPM_NAME = "python313-mpmath-1.3.0-3.4.noarch.rpm"
RPM_HASH = "939261c5512ac72b4bf95bf6dc084044d08673c603550b954c775e7487d516c502cd92d01049ac2ae93545151dba4d36961fd2788b4571bef5f267fd8aae4d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpmath \
python3.13dist-mpmath \
python313-mpmath \
python3dist-mpmath"

RDEPENDS:${PN} += "python-abi \
python313 \
python313-gmpy2"

inherit rpm
