SUMMARY = "LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V."
LICENSE = "BSD-3-Clause"

PV = "23.1.1"

RPM_NAME = "libLLVMSPIRVLib23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "8d44121fe430c3985cf78af382bf2ac91d3cc40388c1e87cd142b4466523b13e96261c97b62ddf8687c145a7a68b413b19e277cdab625410e23d93066f6a14da"

RPROVIDES:${PN} += "libLLVMSPIRVLib.so.23.1 \
libLLVMSPIRVLib23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
