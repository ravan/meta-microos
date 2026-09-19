SUMMARY = "Tcl extension tools for graphviz"
DESCRIPTION = "The graphviz-tcl package contains the various tcl packages (extensions) \
for the graphviz tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-tcl-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "6e560eacae65ad9492b10d057a675f9a56e4c1ec0ebee60b5cf987eeeafedf4b0357b1559b2e193da1d65e9dfa54ed541b220b3f6ea788a34ed71590d447e4ce"

RPROVIDES:${PN} += "graphviz-tcl \
libgdtclft.so \
libgv-tcl.so \
libtcldot-builtin.so \
libtcldot.so \
libtclplan.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcgraph.so.8 \
libexpat.so.1 \
libgcc-s.so.1 \
libgd.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgts-0.7.so.5 \
libgvc.so.7 \
libltdl.so.7 \
libm.so.6 \
libmvec.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpathplan.so.4 \
libstdc++.so.6 \
libxdot.so.4 \
libz.so.1 \
tcl \
tk"

inherit rpm
