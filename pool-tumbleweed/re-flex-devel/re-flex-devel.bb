SUMMARY = "Development files for re-flex"
DESCRIPTION = "RE-flex is a high-performance C++ regex library and lexical analyzer generator \
with Unicode support. \
 \
This package contains files required for building with re-flex (headers, the \
shared-library symlinks, the pkg-config files and the CMake package config)."
LICENSE = "BSD-3-Clause"

PV = "6.4.0"

RPM_NAME = "re-flex-devel-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "56593f2ff47a414bc945eb3ee32c9b32fbbbb03c1b1b000ea29cb17325f5c1b56057c2e93c84f2035c39d41b961c4838feb7bfef9b7a56a779a4c7822252c51d"

RPROVIDES:${PN} += "cmake-Reflex \
pkgconfig-reflex \
pkgconfig-reflexmin \
re-flex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreflex6-4 \
libreflexmin6-4 \
re-flex"

inherit rpm
