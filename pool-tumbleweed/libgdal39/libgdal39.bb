SUMMARY = "GDAL static libraries"
DESCRIPTION = "GDAL and OGR are translator libraries for raster and vector geospatial data \
formats. As a library, it presents a single abstract data model to the calling \
application for all supported formats."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "libgdal39-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "96c3e708e12f4ddfe4736df78fe0ada9574f715451a9f12e5d597a65f63f505f7a8ed7b75882ec41fe13b56e3e0dbde7ed73d48ec0a2492fd2bfe124466a2e40"

RPROVIDES:${PN} += "libgdal.so.39 \
libgdal39"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libLerc.so.4 \
libOpenEXR-3-4.so.33 \
libSFCGAL.so.2 \
libarchive.so.13 \
libarmadillo.so.15 \
libavif.so.16 \
libblosc.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcryptopp.so.8.9.0 \
libcurl.so.4 \
libdeflate.so.0 \
libexpat.so.1 \
libfreexl.so.1 \
libgcc-s.so.1 \
libgdal-drivers \
libgeos-c.so.1 \
libgeotiff.so.5 \
libgif.so.7 \
libgomp.so.1 \
libheif.so.1 \
libjpeg.so.8 \
libjson-c.so.5 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libmuparser.so.2.3.5 \
libodbc.so.2 \
libodbcinst.so.2 \
libopenjp2.so.7 \
libpcre2-8.so.0 \
libpng16.so.16 \
libproj.so.25 \
libqhull-r.so.8.0 \
libspatialite.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libxerces-c-3.3.so \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
