SUMMARY = "R-Tree spatial index for Python GIS"
DESCRIPTION = "A ctypes Python wrapper of libspatialindex that provides a number of advanced \
spatial indexing features for the spatially curious Python user. \
 \
* Nearest neighbor search \
* Intersection search \
* Multi-dimensional indexes \
* Clustered indexes (store Python pickles directly with index entries) \
* Bulk loading \
* Deletion \
* Disk serialization \
* Custom storage implementation (to implement spatial indexing in ZODB, \
  for example)"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python314-Rtree-1.4.1-1.5.noarch.rpm"
RPM_HASH = "39edd834a5c702a9bdf7cf73fa2593bcf78b56ae34e3c87feb3d2944f523a448aebcc44a1d8969cddcc586790cb0a87cf0ff3d4d187b22b30797427d621338c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rtree \
python314-Rtree \
python314-rtree \
python3dist-rtree"

RDEPENDS:${PN} += "libspatialindex8 \
python-abi"

inherit rpm
