SUMMARY = "Quake 1 port using Vulkan instead of OpenGL for rendering"
DESCRIPTION = "vkQuake is a Quake 1 port using Vulkan instead of OpenGL for rendering. It is based on the popular QuakeSpasm port and runs all mods compatible with it like Arcane Dimensions or In The Shadows. \
Game data must be placed in ~/.vkquake/id1 ."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "vkquake-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "e9baba6bcdb6f8db4c7329c0e958dc890dac4fac73bc3caf575e792fcdc60be30e8ce9f4318013878559895a9a51d3be917c03e6a3173ed8fcdac6cb74351552"

RPROVIDES:${PN} += "vkquake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL3.so.0 \
libc.so.6 \
libm.so.6 \
libmpg123.so.0 \
libopusfile.so.0 \
libvorbisfile.so.3 \
libvulkan.so.1"

inherit rpm
