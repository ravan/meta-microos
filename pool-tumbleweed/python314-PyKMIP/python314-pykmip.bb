SUMMARY = "KMIP v11 library"
DESCRIPTION = "PyKMIP is a Python implementation of the Key Management Interoperability \
Protocol (KMIP). KMIP is a client/server communication protocol for the \
storage and maintenance of key, certificate, and secret objects. The standard \
is governed by the `Organization for the Advancement of Structured Information \
Standards`_ (OASIS). PyKMIP supports a subset of features in versions \
1.0 - 1.2 of the KMIP specification."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python314-PyKMIP-0.10.0-11.3.noarch.rpm"
RPM_HASH = "f85b6a1d2dd64cb2b83f90e45ef023e57cecb8def200caef04c9c677f50564ef4bc449ee51fdcc70e51e4881b2c37a3df9177b35be6c733e78660dd20c70f1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pykmip \
python314-PyKMIP \
python3dist-pykmip"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-SQLAlchemy \
python314-cryptography \
python314-requests \
python314-six \
update-alternatives"

inherit rpm
