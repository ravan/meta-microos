SUMMARY = "D-Bus based audio support for QEMU"
DESCRIPTION = "This package provides a module for D-Bus based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-dbus-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "62eb4e6529f1f4843d77402aa398bc315bbcb1dfce315f46b8c4577b988ca5b8f2fdcb14cd2fa416b5e056b6d278df766a65c801ed40922194f357bdeee3fb84"

RPROVIDES:${PN} += "qemu-audio-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
