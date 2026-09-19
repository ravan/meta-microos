SUMMARY = "X11 Sync Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-sync1-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "806efae6c1624cb75c9cef282d3f9d587a79c476423a9ea4ab7a2409da5db6376a6b2a108f4ec04cb158bcaf60f5deba79132246b70681a9e6d3eb32eaa5bed2"

RPROVIDES:${PN} += "libxcb-sync.so.1 \
libxcb-sync1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
