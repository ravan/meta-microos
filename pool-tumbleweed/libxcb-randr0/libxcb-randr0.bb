SUMMARY = "X11 RandR Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-randr0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "e226a0d90fd8115d71052fa2e0f0890cdb368bad57f44e6f5124bf39268bf3959463fe8533f87318c86761a592ec0f839853cd19bc5d4550e4d9501a04a3e418"

RPROVIDES:${PN} += "libxcb-randr.so.0 \
libxcb-randr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
