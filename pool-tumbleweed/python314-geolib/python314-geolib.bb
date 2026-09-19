SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python314-geolib-1.0.7-3.12.noarch.rpm"
RPM_HASH = "3746f80e474bae5b3201c7e1c3f3d79aa1a12d44358c0ebadc0e0b516d391eb6f8d192a7d0666d5f815d67481bd33969ec0d3cc45f3a5cf3a5745d259c027661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geolib \
python314-geolib \
python3dist-geolib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
