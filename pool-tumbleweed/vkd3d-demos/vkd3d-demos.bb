SUMMARY = "Demos for vkd3d"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "vkd3d-demos-2.0-1.5.aarch64.rpm"
RPM_HASH = "278a317b8d6f80990e67f45427007b917b05f1fa98af83ba3cd22f1eee6b6ed9ecb58aeb36f9a9e138e7ad6b57b488a88df40e170ef35313d6b66f9e6809d1b4"

RPROVIDES:${PN} += "vkd3d-demos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvkd3d-utils.so.1 \
libvkd3d.so.1 \
libvkd3d1 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
