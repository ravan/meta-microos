SUMMARY = "GDAL PDF driver plugin"
DESCRIPTION = "GDAL loadable driver plugin for reading and writing geospatial PDF files \
(rendering via Poppler)."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-pdf-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "42b853e138b9ba46b84779f8b7ce50adc6e962f1834a4fab767c73bead8e885cd6996ce1d13dc02bf5e1bd4347076d5780c4d3c74a1dd1325911d21894f2b6e6"

RPROVIDES:${PN} += "gdal-pdf"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libm.so.6 \
libpoppler.so.162 \
libstdc++.so.6"

inherit rpm
