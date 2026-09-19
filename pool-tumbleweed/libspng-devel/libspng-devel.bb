SUMMARY = "Development files for libspng"
DESCRIPTION = "A C library for reading and writing Portable Network Graphics (PNG) \
format files with a focus on security. \
 \
This subpackage contains development files for libspng."
LICENSE = "BSD-2-Clause"

PV = "0.7.4"

RPM_NAME = "libspng-devel-0.7.4-1.5.aarch64.rpm"
RPM_HASH = "52ec7922b7c96933b1fedfc320dcd86e2af612930af541fa6d7d2602151f3369bb78468d6b368a6ef1cc7093ba60715453200b54f664c6f93c7b16bef1a3bc0d"

RPROVIDES:${PN} += "libspng-devel \
pkgconfig-spng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspng0 \
pkgconfig-zlib"

inherit rpm
