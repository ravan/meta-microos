SUMMARY = "lfortran runtime library"
DESCRIPTION = " \
LFortran is a modern open-source (BSD licensed) interactive Fortran \
compiler built on top of LLVM. It can execute user's code interactively \
to allow exploratory work (much like Python, MATLAB or Julia) as well as \
compile to binaries with the goal to run user's code on modern \
architectures such as multi-core CPUs and GPUs. \
 \
This package contains shared runtime libraries of lfortran."
LICENSE = "Apache-2.0-with-LLVM-exception & BSD-3-Clause"

PV = "0.65.0"

RPM_NAME = "liblfortran0-0.65.0-1.1.aarch64.rpm"
RPM_HASH = "2437c6150cf9e18d425a2fe7fec56645bf942b17acb0313ed1d55b0b1cd210cd05d45eec94c264ff79471955444ac887514d58df6c3bf71b592cf0018e7edeab"

RPROVIDES:${PN} += "liblfortran-runtime.so.0 \
liblfortran0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
