SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.8.2"

RPM_NAME = "python314-PyFxA-0.8.2-1.3.noarch.rpm"
RPM_HASH = "ab0233245dc6a5169f225e424595f075f30ed8fa8005be170429abd8339201972623b9f72578acdc469b9be263b2a0de458e9997421e6fd5a559ec386a570f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyfxa \
python314-PyFxA \
python3dist-pyfxa"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyJWT \
python314-cryptography \
python314-hawkauthlib \
python314-requests"

inherit rpm
