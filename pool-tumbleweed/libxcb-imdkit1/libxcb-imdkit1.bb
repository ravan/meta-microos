SUMMARY = "An implementation of xim protocol in xcb"
DESCRIPTION = "xcb-imdkit is an implementation of xim protocol in xcb, comparing with the \
implementation of IMDkit with Xlib, and xim inside Xlib, it has less memory \
foot print, better performance, and safer on malformed client."
LICENSE = "LGPL-2.1-only"

PV = "1.0.9"

RPM_NAME = "libxcb-imdkit1-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "f5b373fb32ae982e1d8b05d3a5234b9c53fbd82dcd4f0f7b35858cb308c273775720cfb488305874bf8703a60900b8758db325ad8e0324dbea3f98d484234d02"

RPROVIDES:${PN} += "libxcb-imdkit.so.1 \
libxcb-imdkit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
