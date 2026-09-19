SUMMARY = "MathGL CGI binary"
DESCRIPTION = "This package contains the MathGL binary for parsing CGI scripts."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-cgi-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "a0a22f775424320ddc903127348960dbb2264ade920b3aab76ddf19cdca5ef72b0e5da65e0633886efc2d29cdddd4a0e77d87de1acb7374f48c8b1ee4ab182c6"

RPROVIDES:${PN} += "mathgl-cgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
libhpdf.so.2.4 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
