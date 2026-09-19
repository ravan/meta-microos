SUMMARY = "XPS document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read XPS documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-xpsdocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "afcabb7ab39a1e7a8c4504c77102f552f0f6a8b4c8f77ccc7bc21f09c67d9f15a7897e3654ad93c7f2eb48f9f947c99ec3b21caa9674245bc58c9d2ed7c723cc"

RPROVIDES:${PN} += "libxpsdocument.so \
xreader-plugin-xpsdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgxps.so.2 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
