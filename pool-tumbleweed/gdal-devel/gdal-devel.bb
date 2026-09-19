SUMMARY = "GDAL library header files"
DESCRIPTION = "Development Libraries for the GDAL file format library"
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-devel-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "e65b887e902b48992b7ca143a57ea3da466ed127cba4988e538198a47571f0df73e581b7a75ebaa45593827e13b29a90950227171a85b2e7489fcd634e6651e5"

RPROVIDES:${PN} += "cmake-GDAL \
gdal-devel \
libgdal-devel \
libgdal39-devel \
pkgconfig-gdal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgdal39 \
pkgconfig-libopenjp2"

inherit rpm
