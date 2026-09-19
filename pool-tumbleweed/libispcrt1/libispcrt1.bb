SUMMARY = "C-based SPMD programming language compiler library"
DESCRIPTION = "Libary for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.31.0"

RPM_NAME = "libispcrt1-1.31.0-2.3.aarch64.rpm"
RPM_HASH = "400d52f5c526b8e532e1a6fb1ed8d8d61f7886a81111d7816d59180749f7c9734976eea0634554e62287ef2b9a36a6580a72aab84281ec386c31e71b35dfc27e"

RPROVIDES:${PN} += "libispc.so.1 \
libispcrt-device-cpu.so.1 \
libispcrt-device-gpu.so.1 \
libispcrt.so.1 \
libispcrt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libgcc-s.so.1 \
libomp.so \
libstdc++.so.6 \
libze-loader.so.1"

inherit rpm
