SUMMARY = "LLVM to backend for AdaptiveCpp"
DESCRIPTION = "LLVM to backend for AdaptiveCpp"
LICENSE = "BSD-2-Clause"

PV = "25.10.0"

RPM_NAME = "libacpp-llvm-to-backend-25.10.0-2.2.aarch64.rpm"
RPM_HASH = "b1e0e67d1e57731f2ca5166261d12f20c0c6f78634f6f87d315e43744e43eb11a69aeac5f70eff8fe08e9340df5480cb6a7534eae539def979518d9d12b4fb9f"

RPROVIDES:${PN} += "libacpp-llvm-to-backend \
libllvm-to-backend.so \
libllvm-to-host.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libacpp-bitcode \
libacpp-common.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
