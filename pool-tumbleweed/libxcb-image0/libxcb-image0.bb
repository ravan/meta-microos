SUMMARY = "XCB utility module for XImage/XShmImage-like functions"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- image: Port of Xlib's XImage and XShmImage functions."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libxcb-image0-0.4.1-1.13.aarch64.rpm"
RPM_HASH = "cd1bcb257365d0018394378dc8a07e9683b366628725298c5ad8b30b098e525ec98ac5fc8ba201315be7da62bbb6883e99e4f863e8a07fb70005156e2e96f720"

RPROVIDES:${PN} += "libxcb-image.so.0 \
libxcb-image0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-shm.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
