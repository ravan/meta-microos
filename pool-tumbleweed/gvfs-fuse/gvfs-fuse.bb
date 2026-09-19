SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. \
 \
This package contains FUSE support that allows applications \
not using GIO to access the GVfs filesystems."
LICENSE = "LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-fuse-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "e4720618d9793680f7cd19ba767a3a46c01e52de5cc0bec316e63d96fb6d738452f73a59d2aba8ed2d6fd3fa7c0decb0acc01911b020be9f74db6943f5999ac3"

RPROVIDES:${PN} += "gvfs-fuse"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse3 \
gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so"

inherit rpm
