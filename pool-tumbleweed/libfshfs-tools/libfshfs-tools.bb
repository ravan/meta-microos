SUMMARY = "Tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Tools to access the Mac OS Hierarchical File System (HFS). See \
libfshfs for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "libfshfs-tools-20260826-1.1.aarch64.rpm"
RPM_HASH = "bee04eeaa4eef97af7556af20ce25a5c54ede25be67cde4d96752c1aabb4d2f77ace188ea622060b322e7b2494060a3268274ceacfb71bd8b9de754fce0bf03e"

RPROVIDES:${PN} += "libfshfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfshfs.so.1 \
libfshfs1 \
libfuse3.so.4 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
