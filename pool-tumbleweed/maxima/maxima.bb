SUMMARY = "Symbolic Computation Program/Computer Algebra System"
DESCRIPTION = "Maxima is a full symbolic computation program.  It is full featured \
doing symbolic manipulation of polynomials, matrices, rational \
functions, integration, Todd-coxeter, graphing, bigfloats.  It has a \
symbolic debugger source level debugger for maxima code.  Maxima is \
based on the original Macsyma developed at MIT in the 1970's.  It is \
quite reliable, and has good garbage collection, and no memory leaks. \
It comes with hundreds of self tests."
LICENSE = "GPL-2.0-or-later"

PV = "5.50.0"

RPM_NAME = "maxima-5.50.0-2.2.aarch64.rpm"
RPM_HASH = "b88f201822afada1bf40bdb938538a76c384222d735ecea067cf904e16afcdca58fb379ec9bd4a50ce6aa399b9bc692c72e6d2c8bcaa1d670a1125bc4b8b5bfb"

RPROVIDES:${PN} += "maxima"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
maxima-exec \
plotutils \
rlwrap"

inherit rpm
