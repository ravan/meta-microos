SUMMARY = "Spherical mercator tile and coordinate utilities"
DESCRIPTION = "The mercantile module provides ul(xtile, ytile, zoom) and bounds(xtile, ytile, zoom) \
functions that respectively return the upper left corner and bounding longitudes and \
latitudes for XYZ tiles, a xy(lng, lat) function that returns spherical mercator \
x and y coordinates, a tile(lng, lat, zoom) function that returns the tile containing \
a given point, and quadkey conversion functions quadkey(xtile, ytile, zoom) and \
quadkey_to_tile(quadkey) for translating between quadkey and tile coordinates."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python314-mercantile-1.2.1-1.17.noarch.rpm"
RPM_HASH = "04e1db8332ba9d8a428da3fdad145905c8f1faa9403ab5d174f0784f43a7c30344fc280459fd784d64e7dc14a6324257ef6e361db7d9fc75161cce3bf1bf4e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mercantile \
python314-mercantile \
python3dist-mercantile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
update-alternatives"

inherit rpm
