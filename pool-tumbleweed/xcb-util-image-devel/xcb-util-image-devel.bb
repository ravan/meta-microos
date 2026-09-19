SUMMARY = "Development files for the XCB image utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-image0."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-image-devel-0.4.1-1.13.aarch64.rpm"
RPM_HASH = "5ec95bc74014bc918210c31aac55e9751095f864f0dba2c279431281e63c913e635311c01e660cfab2d82ad56c15bfe631403479c95bea8964319831e8ef4f6b"

RPROVIDES:${PN} += "pkgconfig-xcb-image \
xcb-util-image-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-image0 \
pkgconfig-xcb \
pkgconfig-xcb-shm"

inherit rpm
