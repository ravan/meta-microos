SUMMARY = "Development files for PROJ"
DESCRIPTION = "This package contains libproj and the appropriate header files and man pages. \
 \
 \
License:        MIT"
LICENSE = "MIT"

PV = "9.8.1"

RPM_NAME = "proj-devel-9.8.1-2.3.aarch64.rpm"
RPM_HASH = "6fe220d888fa95e7bb349f68042f69a6a05dfbbea9ca08c18a4145ce55770ecaf007d48382986c635bb7c8382e6e1e61d3c29a408ce241e5eb7611ed3daf9774"

RPROVIDES:${PN} += "cmake-proj \
cmake-proj4 \
libproj-devel \
pkgconfig-proj \
proj-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproj25 \
pkgconfig-libcurl \
pkgconfig-libtiff-4 \
pkgconfig-sqlite3"

inherit rpm
