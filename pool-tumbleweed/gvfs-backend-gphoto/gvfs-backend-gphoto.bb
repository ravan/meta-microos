SUMMARY = "VFS functionality for GLib -- gPhoto Support"
DESCRIPTION = "This package provides a gvfs backend that supports gPhoto."
LICENSE = "LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-backend-gphoto-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "29f9caaf3b3ae4b4aaf778eb025dd37a4431593c06082d93b7ad830432aed9015bba2b2af9a4494f9c217c4840f7dc64ae65a097bef0eab2a1ad85fdaaf78f2e"

RPROVIDES:${PN} += "gvfs-backend-gphoto"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgudev-1.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so"

inherit rpm
