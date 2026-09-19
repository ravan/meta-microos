SUMMARY = "User preference utility for X"
DESCRIPTION = "This program is used to set various user preference options of the \
display."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "xset-1.2.6-1.2.aarch64.rpm"
RPM_HASH = "7a0da6ec476dbe1b166f7ff2c335dba9257cb3bcacca9351953cc051f1b62eaacfd1ec56091b5188c5b10aeee826ca3ceb686378b2f5dd010c4285a8bfc65ce0"

RPROVIDES:${PN} += "xset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
