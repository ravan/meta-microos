SUMMARY = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
DESCRIPTION = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.70"

RPM_NAME = "perl-OpenGL-0.70-4.9.aarch64.rpm"
RPM_HASH = "c6b30713923a299677b82b32a2d7ead165cf1e52c7d2cec51d209b90d5305454c5cf7aca90da5fdf61fff73ee8d75b84d6ee5b7d933e9e20836b308019b946df"

RPROVIDES:${PN} += "perl-OpenGL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libc.so.6 \
libglut.so.3 \
libm.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
