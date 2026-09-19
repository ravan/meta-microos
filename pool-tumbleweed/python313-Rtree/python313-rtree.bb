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

RPM_NAME = "python313-Rtree-1.4.1-1.5.noarch.rpm"
RPM_HASH = "afce081615d706eff714e3db513f77e17d5b64de702bfae64578ebe38d163dc9b01f059c9d1c41b37a796dc5e154cf23fee577a1e5d22be4f162f7e53bfdd4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Rtree \
python3-rtree \
python3.13dist-rtree \
python313-Rtree \
python313-rtree \
python3dist-rtree"

RDEPENDS:${PN} += "libspatialindex8 \
python-abi"

inherit rpm
