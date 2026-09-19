SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the header and development files for osg2vsg."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libosg2vsg-devel-0.1.0-1.10.aarch64.rpm"
RPM_HASH = "aff08226b689c2e5b11e2da8510016c0173560376649f696ea5b0bcb9586755c686a7a40e2b086f3916751b7e9d35e5ea4d5769761b36e1e3d2dcc504fc423ba"

RPROVIDES:${PN} += "cmake-osg2vsg \
libosg2vsg-devel"

RDEPENDS:${PN} += "libosg2vsg0"

inherit rpm
