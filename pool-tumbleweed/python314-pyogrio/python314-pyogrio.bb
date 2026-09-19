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

RPM_NAME = "python314-pyogrio-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "2e09705c5ef32fdc6dd15322be703c4e52dc3f8a758a801b846aeabc6c9886254de22b87de4cd75d8c1fa2ff0685d70ae567b090f60f3a9db64fe8277d43ce48"

RPROVIDES:${PN} += "python3.14dist-pyogrio \
python314-pyogrio \
python3dist-pyogrio"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
python-abi \
python314-certifi \
python314-numpy \
python314-packaging \
python314-sqlite3"

inherit rpm
