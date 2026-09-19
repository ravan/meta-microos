SUMMARY = "X11 XInput Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinput is an extension to the X Window System intended to replace \
core input processing."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xinput0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "14eaa937cff193e305c4f5d7e62eabd1af06fbe8e1ddfcdf84a99339502f77a307e4c0eb4f9b4dd3bc0b99133fbd962ef5f308fc11b6f74c7a6fd5e8fb442e3f"

RPROVIDES:${PN} += "libxcb-xinput.so.0 \
libxcb-xinput0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
