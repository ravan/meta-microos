SUMMARY = "AV1 codec library"
DESCRIPTION = "This is a library for AOMedia Video 1 (AV1), an open, royalty-free \
video coding format designed for video transmissions over the Internet."
LICENSE = "BSD-2-Clause"

PV = "3.13.1"

RPM_NAME = "libaom3-3.13.1-2.5.aarch64.rpm"
RPM_HASH = "74fcafe8193a00348ab6e7334cb1f74d968c333b40fccc938861a425bf1830b720b32c9f963d1382d68d0ea68745acc1c1cf3f1c355249aeae856f0f7771ed70"

RPROVIDES:${PN} += "libaom.so.3 \
libaom3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvmaf.so.3"

inherit rpm
