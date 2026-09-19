SUMMARY = "MATE Desktop engrampa plugin for caja"
DESCRIPTION = "Engrampa is an archive manager for the MATE Desktop Environment. \
This means that you can create and modify archives; view the \
content of an archive; view and modify a file contained in the \
archive; extract files from the archive."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "caja-engrampa-1.28.1-3.6.aarch64.rpm"
RPM_HASH = "f4996afdcbbd2c8d30bbd3d537df1b75875cbf1bb4cf32297deec57969140f98b3ee02a16ad70a44b8ca72cd42f8c083633c54e58b355f35f40ff6b15e4b814b"

RPROVIDES:${PN} += "caja-engrampa \
libcaja-engrampa.so \
mate-file-manager-engrampa"

RDEPENDS:${PN} += "engrampa \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
