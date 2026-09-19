SUMMARY = "A tool to extract code content from source files"
DESCRIPTION = "A tool to extract code content from source files using the clang and LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "0~20260529.63e5c9b"

RPM_NAME = "clang-extract-0~20260529.63e5c9b-1.4.aarch64.rpm"
RPM_HASH = "d9755d788a153e5b5eb7b3ec6c977104e36715f65ff5f7466cb02eb7c64261844571f54e0667813c94d3b89247d763270fa767b9f80298acafabb5052c32b208"

RPROVIDES:${PN} += "clang-extract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libelf.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
