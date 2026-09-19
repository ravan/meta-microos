SUMMARY = "Qt 6 Tool used by Qt to generate documentation"
DESCRIPTION = "Qt 6 Tool used by Qt to generate documentation."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-tools-qdoc-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "0ce83adafc70d3e9ac163c32f3481df795121b1a1019f844579172ab5dd1c4a6ecd3e6c92b356cfa254fde1e2f364c3e5bf90add5bc40e09b033fe5a6d702e13"

RPROVIDES:${PN} += "qt6-tools-qdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libclang-cpp.so.23.1 \
libclang-cpp23 \
libclang.so.13 \
libclang13 \
libstdc++.so.6"

inherit rpm
