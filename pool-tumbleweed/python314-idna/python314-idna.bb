SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
DESCRIPTION = "A library to support the Internationalised Domain Names in \
Applications (IDNA) protocol as specified in RFC 5891 \
http://tools.ietf.org/html/rfc5891. This version of the protocol \
is often referred to as “IDNA2008” and can produce different \
results from the earlier standard from 2003. \
 \
The library is also intended to act as a suitable drop-in replacement \
for the “encodings.idna” module that comes with the Python standard \
library but currently only supports the older 2003 specification."
LICENSE = "BSD-3-Clause"

PV = "3.19"

RPM_NAME = "python314-idna-3.19-1.1.noarch.rpm"
RPM_HASH = "d85b2415b1f669be2f474d25fe354efd06d176175443b855bce73c0ee1033ef8d49d7bb8affef36b69e922e53a1342fe29811aeb8f0ba2bd9d0ef61e5d14c6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-idna \
python314-idna \
python3dist-idna"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
