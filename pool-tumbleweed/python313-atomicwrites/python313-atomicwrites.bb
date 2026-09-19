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

RPM_NAME = "python313-atomicwrites-1.4.1-5.4.noarch.rpm"
RPM_HASH = "80016ef0f894d8912c07f2dfc15f872bd5d992bef282c7f7503a2ef8b7f577c023c5855018c3ddd734a5f709996542da4a3d9bd9b18c0c1262155d2e0677f7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atomicwrites \
python3.13dist-atomicwrites \
python313-atomicwrites \
python3dist-atomicwrites"

RDEPENDS:${PN} += "python-abi"

inherit rpm
