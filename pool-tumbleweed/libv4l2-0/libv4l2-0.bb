SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l2 offers the v4l2 API on top of v4l2 devices, while adding for the \
application transparent libv4lconvert conversion where necessary. \
 \
This package contains shared lib for packages that use libv4l2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "libv4l2-0-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "88f79f21c260812a22c19f82a25f4f3556bad41abc36810e35a100b9d0c33f3452f0276d91b0063875a417618d61d6190a0d04bb88f38e41a9b54e41be0ec87b"

RPROVIDES:${PN} += "libv4l2-0 \
libv4l2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l \
libv4lconvert.so.0"

inherit rpm
