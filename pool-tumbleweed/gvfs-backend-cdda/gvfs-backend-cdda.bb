SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "This package provides a gvfs backend that supports cdda / libcdio"
LICENSE = "LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-backend-cdda-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "3d7dce68ec93855bcba03f5014fc211670f504021d40f0b90ec6b3f0e8bced582324e29dda617803e2ccd4259c84526111d432606028b8c09795a87096f79a9a"

RPROVIDES:${PN} += "gvfs-backend-cdda \
gvfs-backends-/usr/libexec/gvfs/gvfsd-cdda"

RDEPENDS:${PN} += "gvfs \
gvfs-backends \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so"

inherit rpm
