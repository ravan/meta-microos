SUMMARY = "Libraries generated for TVM"
DESCRIPTION = "Libraries generated for TVM without any provided soname."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libtvm-0.24.0-2.3.aarch64.rpm"
RPM_HASH = "f7e2f8e871af03866112d59199cd8052597166c3fd8c1633082bb2a107d00b25576456623e6d40eb382742f36f092a024d3ee35a58253503f9537d38f296a507"

RPROVIDES:${PN} += "libtvm \
libtvm-compiler.so \
libtvm-ffi.so \
libtvm-runtime.so \
tvm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libSPIRV-Tools-2026.3~rc1.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
libvulkan.so.1"

inherit rpm
