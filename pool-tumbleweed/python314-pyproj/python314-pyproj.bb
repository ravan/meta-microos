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

RPM_NAME = "python314-pyproj-3.7.2-5.3.aarch64.rpm"
RPM_HASH = "f94ad7d845da3d27c2798a8d532b63ceeb26db15279fbb1d8bb97237fc0b6ea3768d58524826e53f1bc1393ab497607d608ad7301a272529cf5d4ac0264a7d3e"

RPROVIDES:${PN} += "python3.14dist-pyproj \
python314-pyproj \
python3dist-pyproj"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libproj.so.25 \
python-abi \
python314-certifi \
update-alternatives"

inherit rpm
