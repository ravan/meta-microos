SUMMARY = "Shared libraries for GeoTIFF library"
DESCRIPTION = "Shared libraries for GeoTIFF library. \
 \
This library is designed to permit the extraction and parsing of the \
'GeoTIFF' Key directories, as well as definition and installation of \
GeoTIFF keys in new files."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "1.7.4"

RPM_NAME = "libgeotiff5-1.7.4-1.7.aarch64.rpm"
RPM_HASH = "f4c406405cfe48cd6ca3483664bfed826eb2df7fc16e9b30e60b847fb4812111212ffe8bdea023cc080c1636707351786e59bbe0f3209f842a8a940466eb5f55"

RPROVIDES:${PN} += "libgeotiff.so.5 \
libgeotiff5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libproj.so.25 \
libtiff.so.6"

inherit rpm
