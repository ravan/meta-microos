SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python314-transip-2.1.2-5.5.noarch.rpm"
RPM_HASH = "5ccc64bdff0fb87ca0d9394585491ac5d5599462b4ed24e3215c4e31d2833b2fecb8bce37b647c42f13cc122fd62ffac141b73caf8eab15c64b4ac0af1a3d436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-transip \
python314-transip \
python3dist-transip"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cryptography \
python314-requests \
python314-suds \
update-alternatives"

inherit rpm
