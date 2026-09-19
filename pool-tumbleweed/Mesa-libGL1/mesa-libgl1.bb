SUMMARY = "The GL/GLX runtime of the Mesa 3D graphics library"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
GLX ('OpenGL Extension to the X Window System') provides the \
interface connecting OpenGL and the X Window System: it enables \
programs wishing to use OpenGL to do so within a window provided by \
the X Window System."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libGL1-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "cef2826ae39ef6346400b48500e2d45316515afb6afb648699d198a9732431101edf58bd8d9d00928565207f25200486f92e527a5c82c45668528720669215e7"

RPROVIDES:${PN} += "Mesa-libGL1 \
libGLX-mesa.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libdrm.so.2 \
libgallium-26.2.2.so \
libglvnd \
libm.so.6 \
libxcb-dri3.so.0 \
libxcb-glx.so.0 \
libxcb-present.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
