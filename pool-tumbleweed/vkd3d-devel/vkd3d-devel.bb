SUMMARY = "Development headers for the Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "vkd3d-devel-2.0-1.5.aarch64.rpm"
RPM_HASH = "12a505811c09182e36a10bdeaef73157f4271bdf61fe4800cb01cc9b687443f56ceb8b5765b4305e2d3937cd9cd49fc23e37f67916ff5466bc20ae0de2b98cc2"

RPROVIDES:${PN} += "pkgconfig-libvkd3d \
pkgconfig-libvkd3d-shader \
pkgconfig-libvkd3d-utils \
vkd3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
libvkd3d-shader.so.1 \
libvkd3d-utils1 \
libvkd3d1"

inherit rpm
