SUMMARY = "A library for controlling media players over D-Bus"
DESCRIPTION = "A library for controlling media players that implement the MPRIS D-Bus \
Interface Specification."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "libplayerctl2-2.4.1-1.21.aarch64.rpm"
RPM_HASH = "679885385d594aee43885d10d9c3f18320450421295430c09bd0a5d2089e081fe60b8c737d7fb7b863ef42905217b38f0fcb20ccd2a8fb8ddd08ae583d536488"

RPROVIDES:${PN} += "libplayerctl.so.2 \
libplayerctl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
