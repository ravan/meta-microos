SUMMARY = "An X11 bar"
DESCRIPTION = "lemonbar is a bar entirely based on XCB. It provides full UTF-8 \
support, basic formatting, RandR and Xinerama support and EWMH \
compliance."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lemonbar-1.5-1.9.aarch64.rpm"
RPM_HASH = "931d787c9a7609199d34b87a6b5c34ab16baa0585c339258d63049ea88ac6bf007b73fa3a2d37f61e5d470221cbeb32340cc5442baa3bc5eecda3b8985352465"

RPROVIDES:${PN} += "lemonbar"

RDEPENDS:${PN} += "libc.so.6 \
libxcb-randr.so.0 \
libxcb.so.1"

inherit rpm
