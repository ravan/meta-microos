SUMMARY = "lfortran static runtime library"
DESCRIPTION = " \
LFortran is a modern open-source (BSD licensed) interactive Fortran \
compiler built on top of LLVM. It can execute user's code interactively \
to allow exploratory work (much like Python, MATLAB or Julia) as well as \
compile to binaries with the goal to run user's code on modern \
architectures such as multi-core CPUs and GPUs. \
 \
This package contains static runtime library for lfortran."
LICENSE = "Apache-2.0-with-LLVM-exception & BSD-3-Clause"

PV = "0.65.0"

RPM_NAME = "lfortran-devel-static-0.65.0-1.1.aarch64.rpm"
RPM_HASH = "9c062cadb8143f28071e53c563f1b897f0918fc96bcdf90b5988e53fc2b9789bc27d4949e48d11a68df13fb8bcc94486220bb86cbb6213973aa1a8e83ccb02b5"

RPROVIDES:${PN} += "lfortran-devel-static"

RDEPENDS:${PN} += "lfortran-devel"

inherit rpm
