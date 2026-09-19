SUMMARY = "Shared library for nanomsg"
DESCRIPTION = "nanomsg is a C socket library providing several common communication \
patterns."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "libnanomsg6-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "70b0dc7c46129c739e2a3a6e10ccd6d8fe78a09d63d39ca21bb8bac5723fd6214ecbde860e3e328d8821d7cac3f7d05cea953bd720c05d32b25dd34f14ecca32"

RPROVIDES:${PN} += "libnanomsg.so.6 \
libnanomsg6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
