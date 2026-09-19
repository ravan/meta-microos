SUMMARY = "Library to handle georeferenced TIFF"
DESCRIPTION = "This library is designed to permit the extraction and parsing of the \
'GeoTIFF' Key directories, as well as definition and installation of \
GeoTIFF keys in new files."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "1.7.4"

RPM_NAME = "geotiff-1.7.4-1.7.aarch64.rpm"
RPM_HASH = "8f8ea8a0671b15b1a5d652277c4bc57ad82d5d835c95a311daea599027a66a8154d77c86fe58e731ee7da7fb877176678e9bded9957671a011de3f9f753a91cd"

RPROVIDES:${PN} += "geotiff"

RDEPENDS:${PN} += "libc.so.6 \
libgeotiff.so.5 \
libtiff.so.6"

inherit rpm
