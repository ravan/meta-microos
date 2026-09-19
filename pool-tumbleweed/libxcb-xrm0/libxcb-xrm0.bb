SUMMARY = "XCB utility module for the X Resource Manager"
DESCRIPTION = "The XCB util modules provides a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- xrm: utility functions for the X resource manager"
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "libxcb-xrm0-1.3-1.20.aarch64.rpm"
RPM_HASH = "9f67feaaf27bc9814c972ce528a55bd363fa434b9766e753024b4433d693d7e63aec930202baed10d8295f9947f23483183c530a4013a7849461c4e50216e7bc"

RPROVIDES:${PN} += "libxcb-xrm.so.0 \
libxcb-xrm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
