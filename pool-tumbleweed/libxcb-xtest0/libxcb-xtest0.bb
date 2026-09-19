SUMMARY = "X11 XTEST Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The XTEST extension is a minimal set of client and server extensions \
required to completely test the X11 server with no user intervention. \
This extension is not intended to support general journaling and \
playback of user actions."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-xtest0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "82e0d860855e505a6522f8c04734088acea0698f322439a58f24c5546ee53a9495571e2e9d9e9e18ff81ab3cfdb83035536cc94892f859edbf99ff0fd34aca2e"

RPROVIDES:${PN} += "libxcb-xtest.so.0 \
libxcb-xtest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
