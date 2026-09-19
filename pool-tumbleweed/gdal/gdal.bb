SUMMARY = "GDAL/OGR - a translator library for raster and vector geospatial data formats"
DESCRIPTION = "GDAL is a translator library for raster geospatial data formats that \
is released under an Open Source license. As a library, it presents a \
single abstract data model to the calling application for all \
supported formats. The related OGR library (which lives within the \
GDAL source tree) provides a similar capability for simple features \
vector data."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "384f8771a93aa4e4010413547b51c49dd96ccfeb19b3cd27c6976e8f294dbba2c329cfb71bbbb1109a84b744f910637abc91f85448d63e81245d1312fbfccf32"

RPROVIDES:${PN} += "gdal"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libstdc++.so.6"

inherit rpm
