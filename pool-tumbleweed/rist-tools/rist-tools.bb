SUMMARY = "User tools for librist"
DESCRIPTION = "This package contains the user tools for the RIST protocol library."
LICENSE = "BSD-2-Clause"

PV = "0.2.20"

RPM_NAME = "rist-tools-0.2.20-1.1.aarch64.rpm"
RPM_HASH = "adcbb3bb4419fe98eb44c18730e92202cf2b962b183ee3fa8f2fbdfae9c4013b1b70645cf0456a6611650606f867c869fde64c675a1f2833d126dfa8df8799dd"

RPROVIDES:${PN} += "rist-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libmicrohttpd.so.12 \
libnettle.so.8 \
librist.so.4"

inherit rpm
