SUMMARY = "Development libraries, includes and man pages for freeglut (GLUT Library)"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and link applications for the freeglut library. \
 \
In addition, it also includes manual pages which describe all functions \
provided by the freeglut library. \
 \
Freeglut is a completely open source alternative to the OpenGL Utility \
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

RPM_NAME = "freeglut-devel-3.2.2-2.6.aarch64.rpm"
RPM_HASH = "3dab6ea0b2e5b3bcc524bd4189418c0182c0774c356630d839b12bd19042bdf213e710da63dccbbbee2749032e5f57555ca281b1456f6b563fa0a8847a14b03b"

RPROVIDES:${PN} += "cmake-FreeGLUT \
freeglut-devel \
mesaglut-devel \
pkgconfig-glut"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglut3 \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
