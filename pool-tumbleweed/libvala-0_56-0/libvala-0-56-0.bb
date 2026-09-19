SUMMARY = "Vala programming language runtime"
DESCRIPTION = "Runtime library for the Vala programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "libvala-0_56-0-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "3d48e7634fdfd089b0ac26467a34610842c3554a59713f80559cf8e3d73b5b03ce9ee646a83f56470dbd29d5b4af27cb585b13dc3948ec96cccb079ab80a1d6a"

RPROVIDES:${PN} += "libvala-0-56-0 \
libvala-0.56.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
