SUMMARY = "Utility to create an X cursor file from a collection of PNG images"
DESCRIPTION = "xcursorgen prepares X11 cursor sets for use with libXcursor."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "xcursorgen-1.0.9-1.7.aarch64.rpm"
RPM_HASH = "a68e863ad4c8a5b589d64e2a3940d46e8595e94347f667807ec0bff116ccc144846c792a84bdf4759ecec2646252ffefeae5f5bbcb15646bb148a318ef5d706e"

RPROVIDES:${PN} += "xcursorgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libc.so.6 \
libpng16.so.16"

inherit rpm
