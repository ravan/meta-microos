SUMMARY = "Shared libraries for vsgXchange"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for vsgXchange."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "libvsgXchange1-1.0.5-2.5.aarch64.rpm"
RPM_HASH = "fa1c8ab207c118608d64733ce36a9b6c7fa911e1c551be61ca62dc713c64c257a86533d8d37cf7071243b76e2eee24d03047d49503d0d0e63ec251a1b5e01f56"

RPROVIDES:${PN} += "libvsgXchange.so.1 \
libvsgXchange1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libassimp.so.6 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libm.so.6 \
libosg2vsg.so.0 \
libstdc++.so.6 \
libvsg.so.14 \
libvulkan.so.1"

inherit rpm
