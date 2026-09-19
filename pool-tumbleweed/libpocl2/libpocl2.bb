SUMMARY = "Shared Library part of pocl"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage contains the shared library part of pocl."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "libpocl2-7.1-2.2.aarch64.rpm"
RPM_HASH = "4bd7ec29657bc367ed10b611e5706f1c81efde62c6229ef6b88ee072c242f20e2a4b80c51d4caa5fb9f423b46189317c36abde85adf12ea70dee502b95656a9d"

RPROVIDES:${PN} += "libpocl.so.2 \
libpocl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libLLVMSPIRVLib.so.23.1 \
libc.so.6 \
libclang-cpp.so.21.1 \
libgcc-s.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm
