SUMMARY = "Development headers for Boost.Context"
DESCRIPTION = "Development headers and libraries for Boost.Context, a library that \
providing cooperative multitasking support."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_context1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "19f914de18e1e5c6a5eea5f40be6583d0ab2ea1f5fe7253095a079c94324f602af7ef90f423a17a8d2daee898c7f296cab9ece68f542a26dcf70b3b983e347ea"

RPROVIDES:${PN} += "libboost-context-devel-impl \
libboost-context1-91-0-devel"

RDEPENDS:${PN} += "libboost-context1-91-0 \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
