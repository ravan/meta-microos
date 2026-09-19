SUMMARY = "Development files for the XCB X Resource Manager utility module"
DESCRIPTION = "The XCB util modules provides a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-xrm0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "xcb-util-xrm-devel-1.3-1.20.aarch64.rpm"
RPM_HASH = "9589001bfe8c3386a8043be5f7ea93ee94c6e0bf0cee7f1ab5e38caa652d1b50301444fc08b13d29f0c8df562986bd34530c173b1aebf0e4c163e7e1b1e6e165"

RPROVIDES:${PN} += "pkgconfig-xcb-xrm \
xcb-util-xrm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-xrm0 \
pkgconfig-xcb \
pkgconfig-xcb-aux"

inherit rpm
