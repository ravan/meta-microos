SUMMARY = "MATE Desktop archive manager"
DESCRIPTION = "Engrampa is an archive manager for the MATE Desktop Environment. \
This means that you can create and modify archives; view the \
content of an archive; view and modify a file contained in the \
archive; extract files from the archive."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "engrampa-1.28.1-3.6.aarch64.rpm"
RPM_HASH = "7935672ae9217283debf86f6a6ce9d01e53f253e13732f79585312af78d00a35b259ba792cac56e65d75095ce002b2041a16b09c2d24ca4869f4fb9177b4f8e8"

RPROVIDES:${PN} += "engrampa \
mate-file-archiver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmagic.so.1 \
libpango-1.0.so.0"

inherit rpm
