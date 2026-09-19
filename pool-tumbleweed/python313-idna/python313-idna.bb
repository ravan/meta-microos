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

RPM_NAME = "python313-idna-3.19-1.1.noarch.rpm"
RPM_HASH = "b4bbc722b7b0f177fd44d304294e5c8e5e2f48c9b8b01bf49bec17289d5834ec197465d453dfaf42161e46fba4e2110d7a7d29e0cd998facb5b0ff3072b44172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-idna \
python3.13dist-idna \
python313-idna \
python3dist-idna"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
