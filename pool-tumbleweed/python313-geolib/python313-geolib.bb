SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python313-geolib-1.0.7-3.12.noarch.rpm"
RPM_HASH = "c0b8d1cb4aad8a23e7f2d1ab6f24d6c9bccf9918bdaab445f00afbfa4bd01fc4ce210bc44aa3fdd3065e0c7f7e7d5bb47d9990581ff0cab873c5aeb81587c919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geolib \
python3.13dist-geolib \
python313-geolib \
python3dist-geolib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
