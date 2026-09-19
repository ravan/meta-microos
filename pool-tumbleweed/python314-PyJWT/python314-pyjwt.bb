SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.13.0"

RPM_NAME = "python314-PyJWT-2.13.0-1.2.noarch.rpm"
RPM_HASH = "5229987945810bf8ea4e8cd7f921259afde4b434de4fa1020b94cd77f1ef5d937bd71e3c3a2f2251f086be32c63970884d20231d8885a339a696ec6421682d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyjwt \
python314-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
