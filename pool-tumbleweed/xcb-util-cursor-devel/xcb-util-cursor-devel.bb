SUMMARY = "Development files for the XCB cursor library (libxcursor port)"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-cursor0."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "xcb-util-cursor-devel-0.1.6-1.5.aarch64.rpm"
RPM_HASH = "c392884df976f23100922b228e7f0bbc8c56dc6009135325ba392c1fe83684067b258496dd1a65d21342488a011cea510814d34de1ff58fca94ae6574158fa90"

RPROVIDES:${PN} += "pkgconfig-xcb-cursor \
xcb-util-cursor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-cursor0 \
pkgconfig-xcb \
pkgconfig-xcb-image \
pkgconfig-xcb-render \
pkgconfig-xcb-renderutil"

inherit rpm
