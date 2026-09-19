SUMMARY = "Development files for libodraw, a disc image file library"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libodraw."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libodraw-devel-20240505-1.24.aarch64.rpm"
RPM_HASH = "d8ac7a048740ab84c72335c00dce78a9e4219aeafdeec2656e90fcca5876ff3377c10d5da37cf6a444968ffce90fba3624c17bce9f348cdaf0329dfe6e9284a7"

RPROVIDES:${PN} += "libodraw-devel \
pkgconfig-libodraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libodraw1"

inherit rpm
