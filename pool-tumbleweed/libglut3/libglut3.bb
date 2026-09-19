SUMMARY = "Freely licensed alternative to the GLUT library"
DESCRIPTION = "Freeglut is a completely open source alternative to the OpenGL Utility \
Toolkit (GLUT) library. GLUT was originally written by Mark Kilgard to \
support the sample programs in the second edition OpenGL Redbook. Since \
then, GLUT has been used in a wide variety of practical applications \
because it is simple, universally available, and highly portable. \
 \
GLUT (and freeglut) allow the user to create and manage windows \
containing OpenGL contexts and also read the mouse, keyboard, and \
joystick functions on a wide range of platforms."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "libglut3-3.2.2-2.6.aarch64.rpm"
RPM_HASH = "c978ad35e150c9169810ea1003781b621c75cdd1a6ad353b41b7aa90e1028cadabc712e00dd714dd2dda01951092cc33073f384f10dae6a3561abbd2b376f9fa"

RPROVIDES:${PN} += "libglut.so.3 \
libglut3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libXxf86vm.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
