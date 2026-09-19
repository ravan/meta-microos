SUMMARY = "Development files for the XCB keysyms utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-keysyms1."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-keysyms-devel-0.4.1-1.12.aarch64.rpm"
RPM_HASH = "512967c32faa886427d4ecff240e7144a6d8ff4b4da315352c9938a9e766241172eafc34175e86e14147790108d53864c1302c22ec92004b0e0285aeef32a6f6"

RPROVIDES:${PN} += "pkgconfig-xcb-keysyms \
xcb-util-keysyms-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-keysyms1 \
pkgconfig-xcb"

inherit rpm
