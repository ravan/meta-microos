SUMMARY = "Macaroon library for Python"
DESCRIPTION = "Macaroons, like cookies, are a form of bearer credential. \
Unlike opaque tokens, macaroons embed caveats that define \
specific authorization requirements for the target service, \
the service that issued the root macaroon and which is \
capable of verifying the integrity of macaroons it recieves. \
 \
Macaroons allow for delegation and attenuation of authorization. \
They are simple and fast to verify, and decouple authorization policy \
from the enforcement of that policy. \
 \
This is a Python implementation of Macaroons."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-pymacaroons-0.13.0-7.5.noarch.rpm"
RPM_HASH = "fe7460786ed19c218d24fdb70f409c2c5c9334ef09bf56a8bd3a7c7627e86109d053bb073de0314cdfb2f5604eead853a41b7c35ae0d5eb237e3a99228d700dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymacaroons \
python314-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python314-PyNaCl \
python314-cffi \
python314-six"

inherit rpm
