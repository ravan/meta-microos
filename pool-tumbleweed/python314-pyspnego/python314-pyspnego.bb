SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python314-pyspnego-0.12.2-1.1.noarch.rpm"
RPM_HASH = "2918eb690e98f1f95729c46c494dcbba0a6f2f53d3806f54959e87947eaf3d1ecbf7c9fa702aa58b1f2bc247e5d678e24aff889ae1f7744c70d31acac60469ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyspnego \
python314-pyspnego \
python3dist-pyspnego"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cryptography"

inherit rpm
