SUMMARY = "Development headers and files for libbsd"
DESCRIPTION = "This library provides functions commonly found on BSD systems, and \
lacking on others like GNU systems, thus making it easier to port projects \
with strong BSD origins, without needing to embed the same code over and \
over again on each project."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd-devel-0.11.7-2.12.aarch64.rpm"
RPM_HASH = "8a17756340aa7595f599c57293c7ed51a20b23c08552703b30b1bb470a83511ed497ea9182afefd2d28f048fbfd28e99de24e06d8714493f9e3c41b3e108b5db"

RPROVIDES:${PN} += "libbsd-devel \
pkgconfig-libbsd \
pkgconfig-libbsd-overlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libbsd0 \
libmd-devel"

inherit rpm
