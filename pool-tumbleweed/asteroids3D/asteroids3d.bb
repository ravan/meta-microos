SUMMARY = "First-person shooter blowing up asteroids"
DESCRIPTION = "A simple first person shooter of blowing up asteroids in 3D space. \
The codebase also serves as an introduction to trigonometry and \
OpenGL."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "asteroids3D-1.0-1.14.aarch64.rpm"
RPM_HASH = "b03186b8076ff3c6b9cdbc89c56f78bada55963d8b43c53a7c4a67a55e08755de83daacac3e73c16127bcf4e5ea35a58f69a7adea281c7e295e0bbf3cd4eef1c"

RPROVIDES:${PN} += "asteroids3D"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libglut.so.3 \
libm.so.6"

inherit rpm
