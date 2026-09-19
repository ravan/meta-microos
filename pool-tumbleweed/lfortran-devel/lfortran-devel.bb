SUMMARY = "Development headers and libraries for lfortran"
DESCRIPTION = " \
LFortran is a modern open-source (BSD licensed) interactive Fortran \
compiler built on top of LLVM. It can execute user's code interactively \
to allow exploratory work (much like Python, MATLAB or Julia) as well as \
compile to binaries with the goal to run user's code on modern \
architectures such as multi-core CPUs and GPUs. \
 \
This package contains development headers and libraries for lfortran."
LICENSE = "Apache-2.0-with-LLVM-exception & BSD-3-Clause"

PV = "0.65.0"

RPM_NAME = "lfortran-devel-0.65.0-1.1.aarch64.rpm"
RPM_HASH = "e6072ca06dee2590cd6dddb1431a76722ab010e431505dcdb08a58369858002fa7d456bd1cd0d63e2bbf7f9dc4325ccfe42682e6b25c88cf2f57f73ca8d74e5f"

RPROVIDES:${PN} += "lfortran-devel"

RDEPENDS:${PN} += "/usr/bin/env \
lfortran \
liblfortran0"

inherit rpm
