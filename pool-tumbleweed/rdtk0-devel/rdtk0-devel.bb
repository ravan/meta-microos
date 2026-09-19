SUMMARY = "FreeRDP Toolkit development files"
DESCRIPTION = "This package contains the development files for RDTK."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "rdtk0-devel-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "a4a883e93e07f665dc0bf7f7199ddceece5018341115bee9a9c6c88b453f68f025542e841ce308b1fd5e716841b95b73b34a42a260bf3d9199587f6b4266b323"

RPROVIDES:${PN} += "cmake-rdtk \
pkgconfig-rdtk0 \
rdtk0-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librdtk0-0"

inherit rpm
