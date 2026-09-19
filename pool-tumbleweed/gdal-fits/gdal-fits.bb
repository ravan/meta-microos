SUMMARY = "GDAL FITS driver plugin"
DESCRIPTION = "GDAL loadable driver plugin for the FITS raster format (cfitsio)."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-fits-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "affa519338cce36b807f1862ce2d2a7e83cf093f82406f0976e2afcaed8a1a520b94564cc77e9c0acdfefd20f668240df1d6fe56c83639fece35e88819e35db8"

RPROVIDES:${PN} += "gdal-fits"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgdal.so.39 \
libstdc++.so.6"

inherit rpm
