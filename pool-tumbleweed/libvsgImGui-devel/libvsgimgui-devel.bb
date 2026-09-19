SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the header and development files for vsgImGui."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "libvsgImGui-devel-0.3.0-1.10.aarch64.rpm"
RPM_HASH = "72792b5d497ed6e3778018018dda7093a45187caf1052705a6b19d723b547d3c920f0dd3c5104c48ec1778a6f6726772b8e8aa3024c99459c51fbb5b93428806"

RPROVIDES:${PN} += "cmake-vsgImGui \
libvsgImGui-devel"

RDEPENDS:${PN} += "libvsgImGui0"

inherit rpm
