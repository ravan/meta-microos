SUMMARY = "Abstraction layer for touchscreens"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.24"

RPM_NAME = "libts0-1.24-1.4.aarch64.rpm"
RPM_HASH = "781910fabbf8936724c45ad268ee55e7f1db822da90e81acc09b03cd97310bbafb3d58173aca4fed31306b252c80d18b4a631ab382ef2142123d0901659ef829"

RPROVIDES:${PN} += "libts.so.0 \
libts0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
