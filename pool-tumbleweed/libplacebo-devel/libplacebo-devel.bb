SUMMARY = "Development files for libplacebo"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "7.360.1"

RPM_NAME = "libplacebo-devel-7.360.1-1.5.aarch64.rpm"
RPM_HASH = "68bb3aa528be478ca71ee81f1e4f3a1aa0f76a9e3c21a9441ac14d818846a280d382dff63615181a09d03516c1edd0730fea8f4f1fff34516bf31316edf0a521"

RPROVIDES:${PN} += "libplacebo-devel \
pkgconfig-libplacebo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplacebo360 \
pkgconfig-dovi \
pkgconfig-lcms2 \
pkgconfig-libunwind \
pkgconfig-shaderc \
pkgconfig-vulkan"

inherit rpm
