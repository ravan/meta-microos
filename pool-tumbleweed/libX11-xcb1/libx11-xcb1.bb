SUMMARY = "XCB X11 protocol client library"
DESCRIPTION = "libX11-xcb provides functions needed by clients which take advantage \
of Xlib/XCB to mix calls to both Xlib and XCB over the same X \
connection."
LICENSE = "MIT"

PV = "1.8.13"

RPM_NAME = "libX11-xcb1-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "0e69fd3a5bd0a572fcf17413e6a261446f931134cec75d971fa961edb5696124f23f7baf056e927ff567eb57b8becd396db1054c3699f83094d7679310f98a18"

RPROVIDES:${PN} += "libX11-xcb.so.1 \
libX11-xcb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11-data"

inherit rpm
