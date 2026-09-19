SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "lldb18-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "2b3f3c16f2bf18e6f833e49fd7471f8cd8fff7edb604ead55625a7e6a82893ecd28b1bfbbbbc477fe76b49cf85bf4010d4cdcb1bff32a4cd10c62f4c4e4c7d21"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb18-devel"

RDEPENDS:${PN} += "clang18-devel \
liblldb18 \
llvm18-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
