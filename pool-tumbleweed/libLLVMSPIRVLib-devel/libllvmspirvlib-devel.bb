SUMMARY = "Development files for LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V. \
 \
This package provides headers and libraries required for building software using \
the LLVM/SPIR-V Bi-Directional Translator library."
LICENSE = "BSD-3-Clause"

PV = "23.1.1"

RPM_NAME = "libLLVMSPIRVLib-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "183bd0a9b7c6c81da67c5d7440b7c3485d18d15441789a82e3e766e46288a691a4856333f0e624e03891f92af86492dd7c0567ecc23f050dd6cd1239d570b78d"

RPROVIDES:${PN} += "libLLVMSPIRVLib-devel \
pkgconfig-LLVMSPIRVLib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libLLVMSPIRVLib.so.23.1 \
libLLVMSPIRVLib23 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
