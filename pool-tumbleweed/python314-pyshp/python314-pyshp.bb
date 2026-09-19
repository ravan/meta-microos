SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "3.1.6"

RPM_NAME = "python314-pyshp-3.1.6-1.1.noarch.rpm"
RPM_HASH = "d2cb26c1fea9c7df75af00b7870e9518b1c3fa99e378a1d9788596356a5571ae2be0d6c2dd89f5f7acf8f5ea975ef9182fb27510437bd82067fc8183cbea10d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyshp \
python314-pyshp \
python3dist-pyshp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
