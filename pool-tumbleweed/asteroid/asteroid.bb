SUMMARY = "Modern version of the classic arcade Game"
DESCRIPTION = "Asteroid (just one!) is a modern version of the arcade classic Asteroids, \
using OpenGL, GLUT, and optionally GTK and SDL_mixer. \
It features a variety of powerups, taunting aliens, 3D textured asteroids, \
face-melting sound effects, and infinite playability."
LICENSE = "GPL-3.0"

PV = "1.2.1"

RPM_NAME = "asteroid-1.2.1-5.4.aarch64.rpm"
RPM_HASH = "c2f55da90683c13a95d5579b41c49610f9077999c9b626449d30acfc30090bbc7184f0b93895d5e086adb7954075495b9d426f6ff64af2dd551d5e516f43782c"

RPROVIDES:${PN} += "asteroid"

RDEPENDS:${PN} += "libGLU.so.1 \
libOpenGL.so.0 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libglut.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
