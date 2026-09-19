SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "libomp18-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "025479281e64fd86ac326ee611487fde5fb3a55e0f043cb87badf47a65c62dd2ac63b64d09c80ce55f9409ee97c420e80bd30cf1f11944688cded38f83c6c06a"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel-provider \
libomp.so \
libomp18-devel \
libompd.so \
libomptarget.rtl.aarch64.so.18.1 \
libomptarget.rtl.amdgpu.so.18.1 \
libomptarget.rtl.cuda.so.18.1 \
libomptarget.so.18.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
