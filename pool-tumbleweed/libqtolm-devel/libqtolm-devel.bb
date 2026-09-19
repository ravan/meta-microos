SUMMARY = "Development files for libqtolm"
DESCRIPTION = "The libqtolm-devel package contains libraries and header files for \
developing applications that use libqtolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libqtolm-devel-3.0.1-1.22.aarch64.rpm"
RPM_HASH = "7a0e77b09f838fe0a83e360393558d71970b6df270a28e8c7ebb866b4979778fd8d8a8e10b3d8a8741ccc99822da0021ddcd49024a336886b99a92891f83b7ed"

RPROVIDES:${PN} += "cmake-QtOlm \
libqtolm-devel \
pkgconfig-QtOlm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQtOlm3-0"

inherit rpm
