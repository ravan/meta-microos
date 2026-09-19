SUMMARY = "Development files for CCfits"
DESCRIPTION = "An object oriented interface to the cfitsio library. \
 \
This package contains header files, and libraries needed to develop \
application that use CCfits."
LICENSE = "MIT"

PV = "2.7"

RPM_NAME = "CCfits-devel-2.7-2.5.aarch64.rpm"
RPM_HASH = "c8806665b64f0abdd1d7a3fdde2fc6c1cc3dbc59ac5b407d560056343ce33d24c56f4ef27afe7c17f9348f3cb396145109a0e2f4edbcc30c7a8bebe7f1ed5182"

RPROVIDES:${PN} += "CCfits-devel \
cmake-CCfits \
pkgconfig-CCfits"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCCfits2-7 \
pkgconfig-cfitsio"

inherit rpm
