SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python313-PyKMIP-0.10.0-11.3.noarch.rpm"
RPM_HASH = "f2fcc8f6b1ed4531723e6a5839ac64a8da611f6cf4fba3ca0f2441ab863dd7d5264d3433ada65aa21fe18c7f9fd432f69fb609aab3fb050d2551dacdc5eead26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyKMIP \
python3.13dist-pykmip \
python313-PyKMIP \
python3dist-pykmip"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-SQLAlchemy \
python313-cryptography \
python313-requests \
python313-six \
update-alternatives"

inherit rpm
