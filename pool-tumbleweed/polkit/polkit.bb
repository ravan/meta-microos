SUMMARY = "PolicyKit Authorization Framework"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "polkit-127-7.2.aarch64.rpm"
RPM_HASH = "132d4dea9f0b28680b3b519accf9da7465a0a0cb93ed689c5f45b99d359da40bf291060c01229c3e995a67cf2091ffd193e0f57b987bd08fd3ff019d41b4bea7"

RPROVIDES:${PN} += "group-polkitd \
polkit \
user-polkitd"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-service \
ld-linux-aarch64.so.1 \
libc.so.6 \
libduktape.so.207 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libpolkit-agent-1-0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1-0 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
permissions \
sysuser-shadow"

inherit rpm
