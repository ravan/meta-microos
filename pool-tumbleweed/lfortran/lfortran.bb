SUMMARY = "A modern interactive Fortran compiler built on top of LLVM"
DESCRIPTION = " \
LFortran is a modern open-source (BSD licensed) interactive Fortran \
compiler built on top of LLVM. It can execute user's code interactively \
to allow exploratory work (much like Python, MATLAB or Julia) as well as \
compile to binaries with the goal to run user's code on modern \
architectures such as multi-core CPUs and GPUs."
LICENSE = "Apache-2.0-with-LLVM-exception & BSD-3-Clause"

PV = "0.65.0"

RPM_NAME = "lfortran-0.65.0-1.1.aarch64.rpm"
RPM_HASH = "9f8c1a4fc9efba6c194ab785b5286ef392831a7d53652f406cfa3600b5a12d89453ca941fdae2ba38c306e121971aedf145e9d869e04c0e01992b1083ea7ee50"

RPROVIDES:${PN} += "lfortran"

RDEPENDS:${PN} += "kokkos-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
