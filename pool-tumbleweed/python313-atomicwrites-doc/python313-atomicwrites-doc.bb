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

RPM_NAME = "python313-atomicwrites-doc-1.4.1-5.4.noarch.rpm"
RPM_HASH = "5161dcc060fcbc99aecdfe5ffe36ba3967727b0fb0868f887fc0c2bf42429926fb1627c14dcbf5365534f60fb184517863ae194dd51f4a999ab829ab001dc95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atomicwrites-doc \
python313-atomicwrites-doc"

RDEPENDS:${PN} += ""

inherit rpm
