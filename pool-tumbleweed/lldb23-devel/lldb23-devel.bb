SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "lldb23-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "b005297b818d2c29b4c000b812d3e70438e7b49329e0b04b9f69499054076c3570bbd918acb65564a4580f66c68b29002f14b3811d44f0e75861e54ed83d8905"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb23-devel"

RDEPENDS:${PN} += "clang23-devel \
liblldb23 \
llvm23-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
