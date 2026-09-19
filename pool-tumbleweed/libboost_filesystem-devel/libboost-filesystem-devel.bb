SUMMARY = "Development headers for Boost.Filesystem library"
DESCRIPTION = "Development headers for Boost.Filesystem library, a library providing \
facilities to manipulate files and directories, and the paths that \
identify them. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_filesystem-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "c67eef4154499168bcc502807174bd1e2ee1a625ef34e5f9c290670121e9e036c594c751a75da685d2994394c214fd2f82ee7036f36c1c849aafee430340dc12"

RPROVIDES:${PN} += "libboost-filesystem-devel"

RDEPENDS:${PN} += "libboost-filesystem1-91-0-devel"

inherit rpm
