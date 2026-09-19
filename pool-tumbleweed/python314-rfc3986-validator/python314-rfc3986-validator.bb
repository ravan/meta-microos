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

RPM_NAME = "python314-rfc3986-validator-0.1.1-2.14.noarch.rpm"
RPM_HASH = "fe3457122b897895c33b4a56085de4d7d3e3531d079324cd94e4f0834996f84077b4daf1ec28fa45c06244dd042707634eb0384395e603c0f3201e3ab0694b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rfc3986-validator \
python314-rfc3986-validator \
python3dist-rfc3986-validator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
