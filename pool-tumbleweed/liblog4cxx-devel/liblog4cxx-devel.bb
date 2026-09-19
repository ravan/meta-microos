SUMMARY = "Log4j like C++ Logging Library"
DESCRIPTION = "Log4cxx is a port to C++ of the log4j logging library."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "liblog4cxx-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "d257df744b79951023a39a702b44b4d35e889f5cd6fde0412e574426a2a9ebaed1a125d89c8dc74cecf00de0ad9f654857d0f66ed093df8f94de08b6b15ee9fa"

RPROVIDES:${PN} += "cmake-log4cxx \
liblog4cxx-devel \
pkgconfig-liblog4cxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4cxx15 \
pkgconfig-apr-1 \
pkgconfig-apr-util-1"

inherit rpm
