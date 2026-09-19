SUMMARY = "Shared libraries for VulkanSceneGraph"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for VulkanSceneGraph."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libvsg14-1.0.9-2.5.aarch64.rpm"
RPM_HASH = "9a502b8152951c1ddd7b7d713d3ea467a860329381a9fb4b3046cd7e32c3d996cf1e936e11d8b0da302f0c1001a52092aad3c72cd56a515e1214a3acef729d1e"

RPROVIDES:${PN} += "libvsg.so.14 \
libvsg14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libxcb.so.1"

inherit rpm
