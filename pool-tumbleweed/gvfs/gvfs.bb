SUMMARY = "Virtual File System functionality for GLib"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. There is also FUSE support that allows applications \
not using GIO to access the GVfs filesystems."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "07d75590c65b64e8e93907b9d56a8832e2e40e8bda1135cf82edbd171be281660c29a3d095ddfc53908242fd4f2f631bd4c2990bf7fb711fd34b524338b38635"

RPROVIDES:${PN} += "gvfs \
libgioremote-volume-monitor.so \
libgvfscommon.so \
libgvfsdaemon.so \
libgvfsdbus.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libsecret-1.so.0 \
systemd"

inherit rpm
