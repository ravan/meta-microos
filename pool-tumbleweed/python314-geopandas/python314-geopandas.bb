SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "python314-geopandas-1.1.4-1.1.noarch.rpm"
RPM_HASH = "2daccfa2a8cf42ae0f6e346664dcb06142ccec5a3251ed6bb4b89b0a0180ef2d47ad46743049062b20cbd06327e984e23e652fe90e30f69500a00d0988539848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geopandas \
python314-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "proj \
python-abi \
python314-numpy \
python314-packaging \
python314-pandas \
python314-pyogrio \
python314-pyproj \
python314-shapely"

inherit rpm
