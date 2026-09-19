SUMMARY = "Thunderbolt 3 device manager"
DESCRIPTION = "Userspace system daemon to enable security levels for Thunderbolt 3 \
on GNU/Linux."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.11"

RPM_NAME = "bolt-0.9.11-2.1.aarch64.rpm"
RPM_HASH = "d190bf05e26225f4e91effe3812677c35dd2867981c41c27592c5dd99ecbd7b2a33cb3f6d7917bec130d5971012a1aca45d15df59b3e4ec6a92693fa15965c5c"

RPROVIDES:${PN} += "bolt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
libudev.so.1"

inherit rpm
