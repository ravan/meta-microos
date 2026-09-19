SUMMARY = "A high-level constraint modelling language"
DESCRIPTION = "You can use MiniZinc to model constraint satisfaction and optimisation \
problems in a high-level, solver-independent way, taking advantage of \
a large library of pre-defined constraints. Your model is then \
compiled into FlatZinc, a solver input language that is understood \
by a wide range of solvers."
LICENSE = "MPL-2.0"

PV = "2.9.3"

RPM_NAME = "minizinc-2.9.3-1.1.aarch64.rpm"
RPM_HASH = "5251fc7a87aaf04de4fe0091724e73e5f54c2b0aba57ccc9a546e81e458ce733aa62754425a10db3ce1e3b4ee41fa8d9b4ef58036adfb4dd47cbeba3cd109299"

RPROVIDES:${PN} += "libmzn.so \
minizinc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgecodedriver.so.51 \
libgecodefloat.so.51 \
libgecodeint.so.51 \
libgecodekernel.so.51 \
libgecodeminimodel.so.51 \
libgecodesearch.so.51 \
libgecodeset.so.51 \
libgecodesupport.so.51 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
