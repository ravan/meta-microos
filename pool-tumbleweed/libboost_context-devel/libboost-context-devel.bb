SUMMARY = "Development headers for Boost.Context"
DESCRIPTION = "Development headers and libraries for Boost.Context, a library that \
providing cooperative multitasking support. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_context-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "818fcb84f1aead9c7501c0067074b75e8b698ddc8c95f0ebcd88dd139f7630f61b5d04fa5af5789928220b000fc4ee3f2cc7e60f54ff7ea48e277486565fafb5"

RPROVIDES:${PN} += "libboost-context-devel"

RDEPENDS:${PN} += "libboost-context1-91-0-devel"

inherit rpm
