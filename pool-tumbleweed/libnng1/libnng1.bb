SUMMARY = "Shared library for nng"
DESCRIPTION = "nng (nanomsg next-generation) is a C socket library providing \
several common communication patterns."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "libnng1-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "0443819eba3ec4717678ac54537d558cec15c0f2dcd98742dd6f051f82643db3740ed6fad69c58998fb5b544f7034492fa57dd4b62d8f33d04acd7c593d660a7"

RPROVIDES:${PN} += "libnng.so.1 \
libnng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
