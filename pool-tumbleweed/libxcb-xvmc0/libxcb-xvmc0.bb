SUMMARY = "X11 Video Motion Compensation Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
X-Video Motion Compensation (XvMC) is an extension of the X video \
extension (Xv) for the X Window System. The XvMC API allows video \
programs to offload portions of the video decoding process to the GPU \
video hardware."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xvmc0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "b44e68c16461d0849ffac8356b03ca06d2c06ce9ba958de235b3a72ec34ec53952292c20c95307220e13b5cda7493a84f486b4808cb382a08c7ecac195c296ca"

RPROVIDES:${PN} += "libxcb-xvmc.so.0 \
libxcb-xvmc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
