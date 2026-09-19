SUMMARY = "GObject based oVirt bindings"
DESCRIPTION = "GoVirt is a GObject wrapper for the oVirt REST API [1]. It will \
only provide very basic functionality as the goal is to \
autogenerate a full wrapper as it is already done for the python \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "libgovirt2-0.3.11-1.3.aarch64.rpm"
RPM_HASH = "e39d8c47c28baa0c70473ced144ef6e0819a1a893156c3c9b0d5b44994c5cc0f2f059ad7d01a0b1b727cbe864fce722a65659a2e83999482f5ac0e674829f769"

RPROVIDES:${PN} += "libgovirt \
libgovirt.so.2 \
libgovirt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librest-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
