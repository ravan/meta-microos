SUMMARY = "Image displayer for X"
DESCRIPTION = "xwud allows X users to display in a window an image saved in a \
specially formatted dump file, such as produced by xwd."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xwud-1.0.8-1.2.aarch64.rpm"
RPM_HASH = "8c1f74ae538b59f81c570b54baa52ad011a78728311a1a1aecc31117265e9965da83ab8c0df7771d1103d94a5bbe6f6b7b8e5efab2012a9f3c6017df8c46b703"

RPROVIDES:${PN} += "xwud"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
