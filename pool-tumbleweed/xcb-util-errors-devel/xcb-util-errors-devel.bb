SUMMARY = "Development files for the XCB errors library"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-errors0."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xcb-util-errors-devel-1.0.1-1.12.aarch64.rpm"
RPM_HASH = "a4dbdaf338b379e518818b238e1a13a02277a11aedb550934ff7fe8e6f4c2a38b0eb5752edc1b63d40bbd60978e5d2bf36fa41f7606e2cd83995c51a74b4d480"

RPROVIDES:${PN} += "pkgconfig-xcb-errors \
xcb-util-errors-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-errors0 \
pkgconfig-xcb"

inherit rpm
