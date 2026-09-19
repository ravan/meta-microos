SUMMARY = "VulkanSceneGraph development files"
DESCRIPTION = "The VulkanSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
Vulkan. \
 \
This package contains the development header and libraries for vsgXchange."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "libvsgXchange-devel-1.0.5-2.5.aarch64.rpm"
RPM_HASH = "2035b7fcadc7ab69519416e51451fd60516b363c88e10a806b3169539c5d39c907efe0a7ae3a6c28df383d966f812d8d01f5cf8f3ae18d69c9868d1811be15aa"

RPROVIDES:${PN} += "cmake-vsgXchange \
libvsgXchange-devel"

RDEPENDS:${PN} += "libvsgXchange1"

inherit rpm
