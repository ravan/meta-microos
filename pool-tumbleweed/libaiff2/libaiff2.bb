SUMMARY = "Open-source implementation of the AIFF format"
DESCRIPTION = "LibAiff is a library with support for reading and writing Audio Interchange \
File Format (AIFF) files. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "libaiff2-6.0-1.6.aarch64.rpm"
RPM_HASH = "11e52d8d4b050ee1dba1b1f80f771feb35332f892b2430fbd6c17113e86fe8f93ec368ade0dbfe88ac58845e078fe585658b88e49eb31471b4473572b60e0cb3"

RPROVIDES:${PN} += "libaiff.so.2 \
libaiff2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
