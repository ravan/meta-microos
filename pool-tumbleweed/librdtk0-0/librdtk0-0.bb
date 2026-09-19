SUMMARY = "FreeRDP Toolkit"
DESCRIPTION = "This package contains the library for the Remote Desktop Toolkit."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "librdtk0-0-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "f3e414afcd0aeca12bd16ab6e7562d3ae82c83f468d23321b0ee992d93b2a7b81bd6312cf73864d5c8ce9f0f79f07fca685fcb8b2a8dcd97d3e62c9e468145c2"

RPROVIDES:${PN} += "librdtk0-0 \
librdtk0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwinpr3.so.3"

inherit rpm
