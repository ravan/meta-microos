SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python314-certipy-0.2.3-1.2.noarch.rpm"
RPM_HASH = "7a174db12c6cf9ccd39559c564696e826c474a7d8e11da0d3c234e5b2bc4ec795d720030e0dab01b7888830492fc8397882107a5c0b58444cd8126bbbc376bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-certipy \
python314-certipy \
python3dist-certipy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cryptography"

inherit rpm
