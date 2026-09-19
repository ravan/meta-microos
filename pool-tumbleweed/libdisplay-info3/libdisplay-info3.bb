SUMMARY = "EDID and DisplayID library"
DESCRIPTION = "libdisplay-info is an EDID and DisplayID library. It provides a \
low-level API exposing all of the details of these formats, plus a \
high-level API (of opinionated functions) which abstracts these \
details for common operations."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "libdisplay-info3-0.3.0-2.5.aarch64.rpm"
RPM_HASH = "eb026bc042a1f80af01d4ead0a422caf6f8b8a90fde2fea5fdba57256c67e7add3ea685fa24f337b435fe6c4c064464df79cb9ec79a0e14d158dc3897375db87"

RPROVIDES:${PN} += "libdisplay-info.so.3 \
libdisplay-info3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
