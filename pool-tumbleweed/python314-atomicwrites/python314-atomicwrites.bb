SUMMARY = "Atomic file writes for Python"
DESCRIPTION = "Atomic file writes for python3. \
Features that distinguish it from other similar libraries: \
 \
- Race-free assertion that the target file doesn't yet exist. This can be \
  controlled with the 'overwrite' parameter. \
 \
- High-level API that wraps a very flexible class-based API."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python314-atomicwrites-1.4.1-5.4.noarch.rpm"
RPM_HASH = "577ab9049929410ff4d74015d5c6a988e28e9ecba2c811f8dcc4ce63613fcd398dd3490712a423df6a247b9f89b33a29651bbfc6b7188ca4679fdc1bc1d1c0dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-atomicwrites \
python314-atomicwrites \
python3dist-atomicwrites"

RDEPENDS:${PN} += "python-abi"

inherit rpm
