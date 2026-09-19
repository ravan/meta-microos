SUMMARY = "Direct3D 12 to Vulkan translation library utilities"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation utilities library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libvkd3d-utils1-2.0-1.5.aarch64.rpm"
RPM_HASH = "764fe1b57731028872b92a8af15c062ba94c4a44e579099233e733f7e8bf52977ca25a6f057693d1d02d722059bfb32e64d0d542fea0b9e62b79ae7f3763776d"

RPROVIDES:${PN} += "libvkd3d-utils.so.1 \
libvkd3d-utils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1 \
libvkd3d.so.1"

inherit rpm
