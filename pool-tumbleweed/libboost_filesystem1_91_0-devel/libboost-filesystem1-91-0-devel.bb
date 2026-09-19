SUMMARY = "Development headers for Boost.Filesystem library"
DESCRIPTION = "Development headers for Boost.Filesystem library, a library providing \
facilities to manipulate files and directories, and the paths that \
identify them."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_filesystem1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "b50fed7626e642a53c2d6a6b18e7ccbf381e336ef70a92dd793a3199f7cd418003d1aa0a70744d7bb294c08f4ba32fea66e3ced805d6229059a3d0a3b7d03222"

RPROVIDES:${PN} += "libboost-filesystem-devel-impl \
libboost-filesystem1-91-0-devel"

RDEPENDS:${PN} += "libboost-atomic1-91-0-devel \
libboost-filesystem1-91-0 \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
