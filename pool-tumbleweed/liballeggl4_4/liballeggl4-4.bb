SUMMARY = "Allegro OpenGL bindings"
DESCRIPTION = "This library allows to use OpenGL from Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeggl4_4-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "3559df2068f6625ff75690b70f9368ab8504542141890de19f57d5794185b27ba3dd4817ac47075cc6d370b0fcc98e444c9ff1444ebded4dfe57fd027cf41f12"

RPROVIDES:${PN} += "liballeggl.so.4.4 \
liballeggl4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXpm.so.4 \
libXxf86vm.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libm.so.6"

inherit rpm
