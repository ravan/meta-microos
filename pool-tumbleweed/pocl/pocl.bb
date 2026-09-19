SUMMARY = "Portable Computing Language - an OpenCL implementation"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
pocl uses Clang as an OpenCL C frontend and LLVM for the kernel compiler \
implementation, and as a portability layer. If your desired target has an LLVM \
backend, it should be possible to get OpenCL support by using pocl. \
 \
pocl yields improved performance portability by using a kernel compiler that \
can generate multi-work-item work-group functions that exploit various types of \
parallel hardware resources, such as VLIW, superscalar, SIMD, SIMT, multicore \
and multithread."
LICENSE = "MIT"

PV = "7.1"

RPM_NAME = "pocl-7.1-2.2.aarch64.rpm"
RPM_HASH = "5ead46a82b4ce057e710ce0ea2f1df0ebb947223271edd038034d28233f1c7f199203cc020d3b95e3a7baac23bfb46e4bd8439a2f9ba42a2b26e2d6ac4e393e8"

RPROVIDES:${PN} += "libpocl-devices-basic.so \
libpocl-devices-pthread.so \
pocl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libpocl.so.2"

inherit rpm
