SUMMARY = "Development files for the XCB EWMH/ICCCM utility modules"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-ewmh2, libxcb-icccm4."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "xcb-util-wm-devel-0.4.2-1.12.aarch64.rpm"
RPM_HASH = "d0023ec59f9d05235ffe09207e46eac1df9ee811850875312c0cd051d5c31a6f06618c6958c59c2e03b1b63115ae7f64fa8f2eb289b7415fc66046d0f70aa339"

RPROVIDES:${PN} += "pkgconfig-xcb-ewmh \
pkgconfig-xcb-icccm \
xcb-util-wm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-ewmh2 \
libxcb-icccm4 \
pkgconfig-xcb"

inherit rpm
