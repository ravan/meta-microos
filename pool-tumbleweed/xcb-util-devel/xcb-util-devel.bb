SUMMARY = "Development files for the XCB utility modules"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. These experimental libraries provide convenience functions \
and interfaces which make the raw X protocol more usable. Some of the \
libraries also provide client-side code which is not strictly part of \
the X protocol but which have traditionally been provided by Xlib. \
 \
This package contains the development headers for the library found \
in libxcb-util1."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-devel-0.4.1-1.12.aarch64.rpm"
RPM_HASH = "474a0726bae0c0698f6f927c1d3de5d5af08c07e00f531c1e71e8efdf4460f31fc5156ac5fdca3ad85df3e5c2633dc4d7bfd29f4c0ca15e7f3c27b5b64359a6a"

RPROVIDES:${PN} += "pkgconfig-xcb-atom \
pkgconfig-xcb-aux \
pkgconfig-xcb-event \
pkgconfig-xcb-util \
xcb-util-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-util1 \
pkgconfig-xcb"

inherit rpm
