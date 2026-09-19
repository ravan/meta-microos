SUMMARY = "GDAL KEA driver plugin"
DESCRIPTION = "GDAL loadable driver plugin for the KEA raster format (libkea/HDF5)."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-kea-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "be33e4f54259f2f51851bb0c14edf34cadd624107d5c9c3a7a3f1bb1f25ef1faa5ba1144daf8331aed30f68095417df09807f68334104a54f6fed82348e19d69"

RPROVIDES:${PN} += "gdal-kea"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libhdf5-cpp.so.310 \
libhdf5.so.310 \
libkea.so.1.6 \
libstdc++.so.6"

inherit rpm
