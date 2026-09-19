SUMMARY = "Window matching library"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains libraries to be used by applications."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "libbamf3-2-0.5.6-1.17.aarch64.rpm"
RPM_HASH = "2cfe223b055c05d9b70c4dce2e2490b16f4bf5f489626b0aca80c43af6fb5ccb3d0709a979fa0f0323a8719953c4ce2168d6acf59dfacf67adca01fdff03efc5"

RPROVIDES:${PN} += "libbamf3-2 \
libbamf3.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
