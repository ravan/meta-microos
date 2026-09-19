SUMMARY = "Header files for spdlog"
DESCRIPTION = "The spdlog-devel package contains C++ header files for developing \
applications that use spdlog."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "spdlog-devel-1.17.0-1.3.aarch64.rpm"
RPM_HASH = "279ae4b433b1ac3894c111bd8f1bd13adb9bc9e1d96eeed5cc01bb4a88e8a0b12abf898ab37063570c6f9ac7a86c62545f3f672c0b9fb146a5fede77a68229fe"

RPROVIDES:${PN} += "cmake-spdlog \
pkgconfig-spdlog \
spdlog-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspdlog1-17 \
libstdc++-devel \
pkgconfig-fmt"

inherit rpm
