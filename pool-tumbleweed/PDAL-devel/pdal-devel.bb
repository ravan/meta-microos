SUMMARY = "Development files and tools for PDAL applications"
DESCRIPTION = "This package provides the headers files and tools you may need to \
develop applications using PDAL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.10.2"

RPM_NAME = "PDAL-devel-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "7062cbc8739432087f42494b08724d790746163434aecde3f523fc9be1011e02fa9120e0ed9ebd1eb2be6802f5d9d0505059197e2f2746ad75f613faccdec0f7"

RPROVIDES:${PN} += "PDAL-devel \
cmake-PDAL \
libPDAL-devel \
libPDAL20-devel \
libpdal-devel \
libpdal20-devel \
pkgconfig-pdal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
cmake \
libPDAL20 \
libboost-filesystem-devel \
libboost-headers-devel \
libboost-program-options-devel \
pkgconfig-gdal \
pkgconfig-liblzma \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
