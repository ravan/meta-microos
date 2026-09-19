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

RPM_NAME = "python313-pymacaroons-0.13.0-7.5.noarch.rpm"
RPM_HASH = "118a8fd7aba41d4a2d659d2a38b8b4e9f302766ae774af7fcd22c4c69b93cff470a690eb8313e5305f67a4a07ac33a30dff389bb4c0981797b195da3306f91d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymacaroons \
python3.13dist-pymacaroons \
python313-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python313-PyNaCl \
python313-cffi \
python313-six"

inherit rpm
