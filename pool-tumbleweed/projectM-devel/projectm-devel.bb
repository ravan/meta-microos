SUMMARY = "Development Files for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-devel-3.1.12-4.7.aarch64.rpm"
RPM_HASH = "4fa720966a47c55eb555b8b525c99a39af2d1773dd3dbaecb943d241e21858c681bdfd34dccf748f53fe05482da0aaef89712aafd5af0bec080d23fb3941f90c"

RPROVIDES:${PN} += "pkgconfig-libprojectM \
projectM-devel \
projectM-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprojectM3 \
projectM \
projectM-data"

inherit rpm
