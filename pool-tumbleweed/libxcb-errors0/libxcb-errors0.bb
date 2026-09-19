SUMMARY = "XCB errors library"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- errors: port of utility library that gives human readable names to error \
  codes and event codes and also to major and minor numbers"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libxcb-errors0-1.0.1-1.12.aarch64.rpm"
RPM_HASH = "cf00bf071839d5235e6bbcb9ad0bc3b8a86c3372e6f9c426788d01e964477821888ac34386b4c89c9d38410401d75b8a43b40762988a58cf8a7d441cfb201ea7"

RPROVIDES:${PN} += "libxcb-errors.so.0 \
libxcb-errors0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
