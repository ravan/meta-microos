SUMMARY = "Library for libstatgrab"
DESCRIPTION = "Library for package libstatgrab."
LICENSE = "LGPL-2.1-or-later"

PV = "0.92.1"

RPM_NAME = "libstatgrab10-0.92.1-2.1.aarch64.rpm"
RPM_HASH = "62e08811f43302ecf755dc851f97c63933b2c24936a32fe745fcfecf9cfd20a9cce4ea2e29a5bb540e4e53441af19e8c58f061ecd5eb4aac491444762662c6a7"

RPROVIDES:${PN} += "libstatgrab.so.10 \
libstatgrab10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
