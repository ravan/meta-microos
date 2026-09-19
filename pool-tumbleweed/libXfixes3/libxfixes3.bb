SUMMARY = "X11 miscellaneous 'fixes' extension library"
DESCRIPTION = "The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "libXfixes3-6.0.2-2.4.aarch64.rpm"
RPM_HASH = "912ca1bd45b84aecdb0623b3679fff46a0ebe2e621535ad1ef8a4c29fbbac5feaef322068c6d019e86bf7fe21f0a5dd1293bce1bfd20b0a899b9747c53bdfa91"

RPROVIDES:${PN} += "libXfixes.so.3 \
libXfixes3 \
xorg-x11-libXfixes"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
