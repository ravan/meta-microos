SUMMARY = "Tools and libraries to work with AppStream metadata"
DESCRIPTION = "AppStream-Core makes it easy to access application information from the \
AppStream database over a nice GObject-based interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "AppStream-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "4ab6ad4aafbcae0964f68fc78feea97449c68724a619c2c78950b523a96c6978ebe399ea094de6b1c1ac029caa213082cb93f8fbfa26230cf2c9d8c954563941"

RPROVIDES:${PN} += "AppStream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappstream.so.5 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
