SUMMARY = "GDAL HDF5 driver plugin"
DESCRIPTION = "GDAL loadable driver plugin for the HDF5 raster format, including the \
derived BAG and S-102/S-104/S-111 product drivers."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-hdf5-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "fbaa96e7c1a95927e4d115ffc07b2526bb4bf7cf232db05aabbbac65bd96b7857d7facd85e2b888e16c1d163979dee6705dc9826ee919d686bf6218f96c15e10"

RPROVIDES:${PN} += "gdal-hdf5"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libhdf5.so.310 \
libm.so.6 \
libproj.so.25 \
libstdc++.so.6"

inherit rpm
