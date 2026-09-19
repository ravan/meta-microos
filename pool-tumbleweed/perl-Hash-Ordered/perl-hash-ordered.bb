SUMMARY = "Fast, pure-Perl ordered hash class"
DESCRIPTION = "This module implements an ordered hash, meaning that it associates keys \
with values like a Perl hash, but keeps the keys in a consistent order. \
Because it is implemented as an object and manipulated with method calls, \
it is much slower than a Perl hash. This is the cost of keeping order. \
 \
However, compared to other *ordered* hash implementations, Hash::Ordered is \
optimized for getting and setting individual elements and is generally \
faster at most other tasks as well. For specific details, see \
Hash::Ordered::Benchmarks."
LICENSE = "Apache-2.0"

PV = "0.014"

RPM_NAME = "perl-Hash-Ordered-0.014-1.17.noarch.rpm"
RPM_HASH = "9185e86cbfeac56d015e2cebe9abae23f463521d71dd07295b80b73bc6800026af8b9f2c6bb362d1741a15b3549aa490f4596a5529088348ef922126693a5222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Ordered \
perl-Hash-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
