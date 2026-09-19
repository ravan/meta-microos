SUMMARY = "Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libvkd3d1-2.0-1.5.aarch64.rpm"
RPM_HASH = "a0fda4ae46086443b8ff16de07fc6ab9f62beeb11741979b008d3d1aa12b9b7733b5b11bcc1143793593ae751c25994da5d4785907138431a71d3629b86c3aaf"

RPROVIDES:${PN} += "libvkd3d.so.1 \
libvkd3d1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1"

inherit rpm
