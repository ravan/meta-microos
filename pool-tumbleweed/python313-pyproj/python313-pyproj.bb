SUMMARY = "Python interface to PROJ library"
DESCRIPTION = "Performs cartographic transformations and geodetic computations. \
 \
The Proj class can convert from geographic (longitude,latitude) to native map \
projection (x,y) coordinates and vice versa, or from one map projection \
coordinate system directly to another. \
 \
The Geod class can perform forward and inverse geodetic, or Great Circle, \
computations. The forward computation involves determining latitude, longitude \
and back azimuth of a terminus point given the latitude and longitude of an \
initial point, plus azimuth and distance. The inverse computation involves \
determining the forward and back azimuths and distance given the latitudes and \
longitudes of an initial and terminus point. \
 \
Input coordinates can be given as python arrays, lists/tuples, scalars or \
numpy/Numeric/numarray arrays. Optimized for objects that support the Python \
buffer protocol (regular python and numpy array objects). \
 \
This project has a git repository https://github.com/pyproj4/pyproj \
where you may access the most up-to-date source."
LICENSE = "LicenseRef-SUSE-Public-Domain & X11"

PV = "3.7.2"

RPM_NAME = "python313-pyproj-3.7.2-5.3.aarch64.rpm"
RPM_HASH = "cab0edca436f41c939e5b057647fb9ddc659b7a90f8287d277a5b271fa8ade9b93e657dbde73cc4c7dcc09dc058e69e02a1b2c3428a16c5fbbbe8e7de5bedba0"

RPROVIDES:${PN} += "python3-pyproj \
python3.13dist-pyproj \
python313-pyproj \
python3dist-pyproj"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libproj.so.25 \
python-abi \
python313-certifi \
update-alternatives"

inherit rpm
