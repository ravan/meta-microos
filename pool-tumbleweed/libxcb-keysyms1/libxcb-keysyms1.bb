SUMMARY = "XCB utility module for X keycode constants and conversions"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- keysyms: Standard X key constants and conversion to/from keycodes."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libxcb-keysyms1-0.4.1-1.12.aarch64.rpm"
RPM_HASH = "00b8b15fe72afc74f19ba08a1056a473298e5ec760ecf7a9d5aa451da253be7e6450925937134ed8f33d53a308e753ac048efdba73b7f347af6c7bc578be3faf"

RPROVIDES:${PN} += "libxcb-keysyms.so.1 \
libxcb-keysyms1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libxcb.so.1"

inherit rpm
