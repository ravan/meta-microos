SUMMARY = "Development files for leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the development files for leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-devel-1.23-6.7.aarch64.rpm"
RPM_HASH = "f660fc85cba3d70938c38df6403a5cf3ca8ed491865c065d0c9a19bc963930078b31e56db8cf2d37bfeb4c12dfa6eb26a6c428defcb1ac432806ca6e1e33b1e5"

RPROVIDES:${PN} += "cmake-leveldb \
leveldb-devel"

RDEPENDS:${PN} += "libleveldb1"

inherit rpm
