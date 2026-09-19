SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python314-gwcs-1.0.3-1.2.noarch.rpm"
RPM_HASH = "8acc29fc46f127bface5915aa9620aa07268189ecb60cdb51c5989d8520ba278a47b66c2220c64336c258f40d7c131ba7a5f98565fabf709064b75eeb4d69d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gwcs \
python314-gwcs \
python3dist-gwcs"

RDEPENDS:${PN} += "python-abi \
python314-asdf \
python314-asdf-astropy \
python314-asdf-wcs-schemas \
python314-astropy \
python314-numpy \
python314-scipy"

inherit rpm
