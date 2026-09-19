SUMMARY = "Shared libraries for osg2vsg"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the shared libraries for osg2vsg"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libosg2vsg0-0.1.0-1.10.aarch64.rpm"
RPM_HASH = "d3b6079b86ce9bc30feafd261d3fa179acd8b7625799745696eb3d335ad9052361e1da72eba16fe4910ae64491aca5c9be550c0dfdd15155a50317f8e83f9e1c"

RPROVIDES:${PN} += "libosg2vsg.so.0 \
libosg2vsg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosg.so.161 \
libosgDB.so.161 \
libosgTerrain.so.161 \
libosgUtil.so.161 \
libstdc++.so.6 \
libvsg.so.14"

inherit rpm
