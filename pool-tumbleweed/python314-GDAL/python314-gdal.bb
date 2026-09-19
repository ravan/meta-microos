SUMMARY = "GDAL Python module"
DESCRIPTION = "The GDAL python modules provide support to handle multiple GIS file formats."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "python314-GDAL-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "99402d2aa7d15082ce75b56308bf8da29c3011361761d6045c85a0f80018c1cd800012b87810e7f062342a438514dc907350e30940e34f7cf0b01053cf79db2e"

RPROVIDES:${PN} += "python3.14dist-gdal \
python314-GDAL \
python314-gdal \
python3dist-gdal"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
