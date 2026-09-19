SUMMARY = "Numbers with error propagation and scientific rounding"
DESCRIPTION = "This class is a container class for numbers with a number of associated \
symmetric and asymmetric errors. It overloads practically all common \
arithmetic operations and trigonometric functions to propagate the errors. \
It can do proper scientific rounding (as explained in more detail below in \
the documentation of the 'significant_digit()' method). \
 \
You can use Math::BigFloat objects as the internal representation of \
numbers in order to support arbitrary precision calculations. \
 \
Errors are propagated using Gaussian error propagation. \
 \
With a notable exception, the test suite covers way over ninety percent of \
the code. The remaining holes are mostly difficult-to-test corner cases and \
sanity tests. The comparison routines are the exception for which there \
will be more extensive tests in a future release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Number-WithError-1.01-2.12.noarch.rpm"
RPM_HASH = "d26a5d5f28efb9b283d1f096c0ac128d54d85ce047fae11a1cdab0253b3c6ea8f433b6016bc65132a90018ad5b8929d3834f986e54083a397dd7615c027b56f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--WithError \
perl-Number-WithError"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Params--Util \
perl-prefork"

inherit rpm
