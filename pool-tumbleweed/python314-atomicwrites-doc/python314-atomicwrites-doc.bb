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

RPM_NAME = "python314-atomicwrites-doc-1.4.1-5.4.noarch.rpm"
RPM_HASH = "d416430debf42806c990c231e2b3e76a8a96afda9dd20031ac360dae1ddaf53624786a6b90b36a81250197e7b76bfafce3c6fba61259c4101eb98b8f89a09867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-atomicwrites-doc"

RDEPENDS:${PN} += ""

inherit rpm
