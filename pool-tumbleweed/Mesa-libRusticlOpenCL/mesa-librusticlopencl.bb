SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libRusticlOpenCL-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "a0f249b2fa54b7f7ee0f6467a03ab3185599b8efd72b4cc3cccaab6931d269e014e36c3c35418032d42168b2476b98c4c0d297e7117e7a027d81443a22623edb"

RPROVIDES:${PN} += "Mesa-libRusticlOpenCL \
libRusticlOpenCL.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libLLVMSPIRVLib.so.23.1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-link-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libc.so.6 \
libclang-cpp.so.23.1 \
libclc-llvm23 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
