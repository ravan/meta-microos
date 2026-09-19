SUMMARY = "The LLVM D Compiler"
DESCRIPTION = "LDC is an LLVM based compiler for the D programming language. It uses the \
frontend of the reference compiler (DMD), thereby supporting the same language \
features, but profits from LLVM's superior optimizing and code generation \
capabilities."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "ldc-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "d8a326b30fd05f514967da94ffedb9da70e95cd6286f64f641a8c787ae7d9fea31c6fae851d429eb9cc3cb6c44584aa3e347a92d8db1d38f9133ee2edc41fbfd"

RPROVIDES:${PN} += "ldc"

RDEPENDS:${PN} += "libLLVM.so.19.1 \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1 \
libm.so.6 \
libphobos2-ldc-shared.so.112 \
libstdc++.so.6"

inherit rpm
