SUMMARY = "PolicyKit Authorization Framework -- Agent Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the agent library only."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "libpolkit-agent-1-0-127-7.2.aarch64.rpm"
RPM_HASH = "5259de95e50204630c31801882f0a44d07e1a453ccd97329f17f2971ee71969a7549732684c69d8105bc1078f11bba245a510935e266cf99b664d19e765b120e"

RPROVIDES:${PN} += "libpolkit-agent-1-0 \
libpolkit-agent-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
polkit"

inherit rpm
