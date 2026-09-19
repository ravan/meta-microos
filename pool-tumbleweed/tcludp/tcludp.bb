SUMMARY = "UDP Socket Extension for Tcl"
DESCRIPTION = "This package makes the UDP protocol available for Tcl interpreters. It \
allows access to message-oriented UDP through stream-oriented Tcl \
channels."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "tcludp-1.0.11-1.36.aarch64.rpm"
RPM_HASH = "18577181df7cd0d5ca0f91a407d001ee7bf8053f762f61b34f24c888419f54be38354f3064111b64ae7f1970e34fa151233cb80b791383611a6ea9a9ffe07255"

RPROVIDES:${PN} += "libudp1.0.11.so \
tcludp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
