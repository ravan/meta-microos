SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.13.0"

RPM_NAME = "python313-PyJWT-2.13.0-1.2.noarch.rpm"
RPM_HASH = "08538cd93c625cf816ebb2d76a60a6e6b2fc767c3cfabb49c6b821368eb49500196c212a10487b6d53ea2915c87196a94c97006887bf7aef5acf05b57e487a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyJWT \
python3.13dist-pyjwt \
python313-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
