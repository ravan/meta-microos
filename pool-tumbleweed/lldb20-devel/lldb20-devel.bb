SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "lldb20-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "e54ed4edae39a7df89238384c6bb9f2215e5d33a3edd386b407f8e7bd47d3d78d4d6f29fd7f04d43efd5cf906d7f85a9b2ad5a16573635050afc1a5cead9b6ae"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb20-devel"

RDEPENDS:${PN} += "clang20-devel \
liblldb20 \
llvm20-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
