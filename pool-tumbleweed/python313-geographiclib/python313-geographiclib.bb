SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python313-geographiclib-2.1-1.1.noarch.rpm"
RPM_HASH = "79220902f24bf22179c5e54be745f627ad54eb59aca4867709d4416b25f605b5f3a544da9946f742c90b1dd7e1f69d7737ed5e65aa78bac4cf61e9cfe4f93d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geographiclib \
python3.13dist-geographiclib \
python313-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
