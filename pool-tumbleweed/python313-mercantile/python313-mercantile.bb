SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python313-mercantile-1.2.1-1.17.noarch.rpm"
RPM_HASH = "b9acdcebf35fb70159260a1979eedd0dd2c37f5c05b3256ae0f79c28a4af340d6d305a80bd71c12709a361441497ec628145d74dae3a56c37676dfc0346d87e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mercantile \
python3.13dist-mercantile \
python313-mercantile \
python3dist-mercantile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
update-alternatives"

inherit rpm
