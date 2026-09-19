SUMMARY = "Adjustment of geodetic networks"
DESCRIPTION = "GNU Gama is a project dedicated to adjustment of geodetic \
networks. It is intended for use with traditional geodetic \
surveyings which are still used and needed in special measurements \
(e.g., underground or high precision engineering measurements) \
where the Global Positioning System (GPS) cannot be used. \
 \
Adjustment in local Cartesian coordinate systems is fully \
supported by a command-line program gama-local that adjusts \
geodetic (free) networks of observed distances, directions, \
angles, height differences, 3D vectors and observed coordinates \
(coordinates with given variance-covariance matrix). Adjustment in \
global coordinate systems is supported only partly as a gama-g3 \
program."
LICENSE = "GPL-3.0-or-later"

PV = "2.33"

RPM_NAME = "gama-2.33-1.9.aarch64.rpm"
RPM_HASH = "62633f6fd1e6f7561b73eff6dd636e790452205d986a15f9e83e09547cf23aebacf6cdded240bd293254b71338c2c60f9b2d41907b7f9574e4af3dcb748916c8"

RPROVIDES:${PN} += "gama"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2-tools \
libyaml-cpp.so.0.9"

inherit rpm
