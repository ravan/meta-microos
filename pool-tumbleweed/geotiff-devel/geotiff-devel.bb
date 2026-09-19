SUMMARY = "GeoTIFF header files"
DESCRIPTION = "Header files for GeoTIFF library. \
 \
This library is designed to permit the extraction and parsing of the \
'GeoTIFF' Key directories, as well as definition and installation of \
GeoTIFF keys in new files."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "1.7.4"

RPM_NAME = "geotiff-devel-1.7.4-1.7.aarch64.rpm"
RPM_HASH = "38182630200325418ad3eb4e66d7ace95a8e290c892a69fb005c1024e6334a85219685771ad3be5289b1dbf9c39c1d8f26adf6ffe34bd4da748b423a883990d2"

RPROVIDES:${PN} += "geotiff-devel \
libgeotiff-devel \
pkgconfig-libgeotiff"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeotiff5 \
pkgconfig-libtiff-4 \
pkgconfig-proj"

inherit rpm
