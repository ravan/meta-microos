SUMMARY = "Pure python rfc3986 validator"
DESCRIPTION = "A pure python rfc3986 validator \
 \
Usage: \
    >>> from rfc3986_validator import validate_rfc3986 \
    >>> validate_rfc3986('http://foo.bar?q=Spaces should be encoded') \
    False \
 \
    >>> validate_rfc3986('http://foo.com/blah_blah_(wikipedia)') \
    True"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-rfc3986-validator-0.1.1-2.14.noarch.rpm"
RPM_HASH = "bcb4829cac033b69daf4eff7e49cb68a797839a8f1c9f0d797ca2a4405ecfee5dfd17c964d0e45212abbf80bbae5fd1150a7a47858ab8540d3ece0cf937ebdec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc3986-validator \
python3.13dist-rfc3986-validator \
python313-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
