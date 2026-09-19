SUMMARY = "Demonstration applications for the freeglut library"
DESCRIPTION = "This package contains demonstration applications for the freeglut library. \
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

RPM_NAME = "freeglut-demo-3.2.2-2.6.aarch64.rpm"
RPM_HASH = "f1351e9f1abc124abf386b0dda772037fd71725fa9fa9e87c49553927221b5610b664577c34ad8f8a38bf98d1a14a47d9f4bdbf8f39557598039f68d7315412b"

RPROVIDES:${PN} += "freeglut-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libglut.so.3 \
libm.so.6"

inherit rpm
