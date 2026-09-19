SUMMARY = "X11 RECORD Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocols and arbitrary X extension protocols."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-record0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "1fe741917b7070148f0eb8cf2ca90bf3fef1f53d1e70ae2c41faf590dfa4f9a4aa5d11f26b4fa1f16d287ef13a130093b8940fc089c76e1ef342bdda188018a5"

RPROVIDES:${PN} += "libxcb-record.so.0 \
libxcb-record0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
