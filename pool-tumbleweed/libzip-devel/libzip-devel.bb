SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "libzip is a C library for reading, creating, and modifying zip \
archives. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.11.4"

RPM_NAME = "libzip-devel-1.11.4-1.5.aarch64.rpm"
RPM_HASH = "afb056c3916f1b47ab907cb4e52e3f1ad0a3b57bd0ef66ab9a25b3fa123a87ac4307ffe9818035d38c4ebb75de7c8bb25c4106bddaf28292c4d5b0e0fb400007"

RPROVIDES:${PN} += "cmake-libzip \
libzip-devel \
pkgconfig-libzip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzip-tools \
libzip5"

inherit rpm
