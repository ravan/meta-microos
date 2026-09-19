SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "python313-geopandas-1.1.4-1.1.noarch.rpm"
RPM_HASH = "dadca141349c3fa1d0ea97e5fec2a13d7a2c2b81ff8423b07b567133549885d358bed40e34e7d4be78c4e7fb9930c3655e17b5c53f697d29e974a9a6509bed24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geopandas \
python3.13dist-geopandas \
python313-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "proj \
python-abi \
python313-numpy \
python313-packaging \
python313-pandas \
python313-pyogrio \
python313-pyproj \
python313-shapely"

inherit rpm
