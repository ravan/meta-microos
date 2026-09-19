SUMMARY = "Graphviz context library"
DESCRIPTION = "libgvc provides a context for applications wishing to manipulate and render \
graphs. It provides a command line parsing, common rendering code, and a \
plugin mechanism for renderers."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "libgvc7-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "95b091d5236e836f86ecc8f6ea5c54e7607160353643b4e70ed74845743d5688ae44e71e6e3c2047bfaa3db4d34f2e03d79e25b8f7d0c56edeba7cd9c24d4653"

RPROVIDES:${PN} += "libgvc.so.7 \
libgvc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.6 \
libcgraph.so.8 \
libexpat.so.1 \
libltdl.so.7 \
libm.so.6 \
libmvec.so.1 \
libpathplan.so.4 \
libxdot.so.4 \
libz.so.1"

inherit rpm
