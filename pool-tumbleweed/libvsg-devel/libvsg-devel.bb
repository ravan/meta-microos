SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the header and development files for \
VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libvsg-devel-1.0.9-2.5.aarch64.rpm"
RPM_HASH = "755836f8447c843f0bdee07fdfce273d36ea26277a0e19cf7f02460b6bb9e1bcdff536007c1137c34b64803883ea8be3a04ddeb806e5b13bb641baaccf30b360"

RPROVIDES:${PN} += "cmake-vsg \
libvsg-devel"

RDEPENDS:${PN} += "libvsg14 \
pkgconfig-vulkan"

inherit rpm
