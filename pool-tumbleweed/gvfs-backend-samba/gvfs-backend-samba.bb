SUMMARY = "VFS functionality for GLib -- Samba Support"
DESCRIPTION = "This package provides a gvfs backend that supports Samba."
LICENSE = "LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-backend-samba-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "c95e92fcee04de3417e0aea2f666bdda82dd56d0437460e36a99743184a71cda9d6b530fd50241fdc0794954701ff34f80e809ded440c240a824f54d4ddc0d5d"

RPROVIDES:${PN} += "gvfs-backend-samba"

RDEPENDS:${PN} += "gvfs \
gvfs-backends \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libsmbclient.so.0"

inherit rpm
