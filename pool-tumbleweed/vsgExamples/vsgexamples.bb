SUMMARY = "3D graphics toolkit"
DESCRIPTION = "Example programs that test and illustrate how to use the VulkanSceneGraph and optional add-on libraries"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "vsgExamples-1.0.7-1.10.aarch64.rpm"
RPM_HASH = "abe22d16f9d94be91f4d753c1e2a382ad7383cade59f5e2b9ab7747f7e229aee1ab4c4d953a0861376306be2092cca8b9b93b515f002cce92f98e4f96bb488a9"

RPROVIDES:${PN} += "config-vsgExamples \
vsgExamples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvsg.so.14 \
libvsgImGui.so.0 \
libvsgXchange.so.1 \
libvulkan.so.1"

inherit rpm
