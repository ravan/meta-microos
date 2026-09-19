SUMMARY = "Vectorized spatial vector file format I/O using GDAL/OGR"
DESCRIPTION = "Pyogrio provides a GeoPandas-oriented API to OGR vector \
data sources, such as ESRI Shapefile, GeoPackage, and GeoJSON. Vector data sources \
have geometries, such as points, lines, or polygons, and associated records \
with potentially many columns worth of data. \
 \
Pyogrio uses a vectorized approach for reading and writing GeoDataFrames to and \
from OGR vector data sources in order to give you faster interoperability. It \
uses pre-compiled bindings for GDAL/OGR so that the performance is primarily \
limited by the underlying I/O speed of data source drivers in GDAL/OGR rather \
than multiple steps of converting to and from Python data types within Python."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-pyogrio-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "ff3eb85fc72849690cc7c669e196739df5199e7fde83282e51c870ffd56c9dab28b3add21fab84d607f820d43850bf804c725b728654cae4690dd749bdce026b"

RPROVIDES:${PN} += "python3-pyogrio \
python3.13dist-pyogrio \
python313-pyogrio \
python3dist-pyogrio"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
python-abi \
python313-certifi \
python313-numpy \
python313-packaging \
python313-sqlite3"

inherit rpm
