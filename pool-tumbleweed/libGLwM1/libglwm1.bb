SUMMARY = "Motif OpenGL drawing area widget library"
DESCRIPTION = "Motif OpenGL drawing area widget library shipped by the Mesa Project."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libGLwM1-8.0.0-7.13.aarch64.rpm"
RPM_HASH = "df1e89e58f2c7742b5c11af794388d16bc23e47801a2907ef214fc82dd393a218a7ef711abd9716cd93562b7705d5a9e78e00dc31cf7c95a64673ed14e870b0d"

RPROVIDES:${PN} += "GLw1 \
MesaGLw \
libGLw.so.1 \
libGLwM1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
openmotif"

inherit rpm
