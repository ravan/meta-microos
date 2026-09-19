SUMMARY = "Development files for libplacebo5"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo5-devel-5.264.1-5.5.aarch64.rpm"
RPM_HASH = "e313c7c2df96b3c501f05431961a97656c36b9fc9cb760cf325e9a1bfa34606c212c7b9fd030f7a68c7f29584385c64d75228360912d9da6b605fdbf16a46a5a"

RPROVIDES:${PN} += "libplacebo5-devel \
pkgconfig-libplacebo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplacebo264 \
pkgconfig-dovi \
pkgconfig-lcms2 \
pkgconfig-libunwind \
pkgconfig-shaderc \
pkgconfig-vulkan"

inherit rpm
