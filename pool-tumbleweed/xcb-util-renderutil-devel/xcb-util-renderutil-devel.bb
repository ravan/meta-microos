SUMMARY = "Development files for the XCB Render utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-render-util0."
LICENSE = "MIT"

PV = "0.3.10"

RPM_NAME = "xcb-util-renderutil-devel-0.3.10-1.12.aarch64.rpm"
RPM_HASH = "4a8501c864c3d6d550359e11dad2c9070eb1a3f6937079dd020c7139ef5f5535790a3d63e45350f2394461a87625554f783cbbefb74cf9a3f8bfddb2a2f31188"

RPROVIDES:${PN} += "pkgconfig-xcb-renderutil \
xcb-util-renderutil-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-render-util0 \
pkgconfig-xcb \
pkgconfig-xcb-render"

inherit rpm
