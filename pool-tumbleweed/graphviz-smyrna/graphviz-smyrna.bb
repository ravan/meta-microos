SUMMARY = "Large graph viewer"
DESCRIPTION = "Experimental large graph viewer using graphviz"
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-smyrna-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "2ce3f116004f54871d793e051e5166ec90e796fc490d07d013260e83b107be926c1e854a0908956fe15598e0a9d58364712a951b4c4314c825125504d75e3d9a"

RPROVIDES:${PN} += "graphviz-smyrna"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libcairo.so.2 \
libcdt.so.6 \
libexpat.so.1 \
libgdk-x11-2.0.so.0 \
libgdkglext-x11-1.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libglut.so.3 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkglext-x11-1.0.so.0 \
libgts-0.7.so.5 \
libltdl.so.7 \
libm.so.6 \
libmvec.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxdot.so.4 \
libz.so.1"

inherit rpm
