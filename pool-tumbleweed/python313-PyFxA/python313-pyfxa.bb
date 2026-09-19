SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.8.2"

RPM_NAME = "python313-PyFxA-0.8.2-1.3.noarch.rpm"
RPM_HASH = "05bacb32064ea536b38b36a347580cd1559e946b84b4964d9352606e9b669b039e4c078f0bbcd08de5edab5361000e93e636b55e37360dc5d5c94b451c32ded0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyFxA \
python3.13dist-pyfxa \
python313-PyFxA \
python3dist-pyfxa"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyJWT \
python313-cryptography \
python313-hawkauthlib \
python313-requests"

inherit rpm
