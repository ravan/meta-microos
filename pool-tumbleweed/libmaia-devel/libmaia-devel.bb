SUMMARY = "Development files for libmaia"
DESCRIPTION = "The libmaia-devel package contains libraries and header files for \
developing applications that use libmaia."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia-devel-0.9.0-1.37.aarch64.rpm"
RPM_HASH = "12a63dd1ada8a8315b60d4d391c54bdc5b60bb7aeb78eaacc16303017754bcfd40c8cb50ab72c84d22ae8c9708b4a8ebdcd2317db91c8d28340e38f8246609ca"

RPROVIDES:${PN} += "libmaia-devel \
pkgconfig-maia"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmaia1"

inherit rpm
