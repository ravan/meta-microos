SUMMARY = "Development files for sexpp"
DESCRIPTION = "This is a C++ library for working with S-expressions. S-expressions \
are a data structure for representing complex data as a variation on \
LISP S-expressions. \
 \
This package contains the files required for developing using sexpp."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "sexpp-devel-0.9.2-1.5.aarch64.rpm"
RPM_HASH = "89e0633a94c21d469ac06882a6b664fd4d78f76bd50465ccafa84dda4e62180f6ea413b39f0ff8d0dcb1e52a9307075322d97b9f866d3bd15c5bef307f661397"

RPROVIDES:${PN} += "pkgconfig-sexpp \
sexpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsexpp0"

inherit rpm
