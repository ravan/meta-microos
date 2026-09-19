SUMMARY = "Shared libraries for vsgImGui"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for ImGui."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "libvsgImGui0-0.3.0-1.10.aarch64.rpm"
RPM_HASH = "5f24bc3d7f23ca15de40e19390ddb5adaaa041263cd1f92196df6cfe03aa1780c00b7b8303f01df6138405a643d526c0ffae36d61e5eb731b5c369ad7bbd0d38"

RPROVIDES:${PN} += "libvsgImGui.so.0 \
libvsgImGui0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvsg.so.14 \
libvulkan.so.1"

inherit rpm
