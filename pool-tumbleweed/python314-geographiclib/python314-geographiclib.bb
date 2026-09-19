SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python314-geographiclib-2.1-1.1.noarch.rpm"
RPM_HASH = "e840799f1479c98f5d4d32fdc903855779a8260d491dabedcc75a53dea0e8c544955099f89bbfedf0695c99aa483c52d581ec7be2ffb96544e1ed18731e1e41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geographiclib \
python314-geographiclib \
python3dist-geographiclib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
