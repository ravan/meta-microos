SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "lldb19-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "6e2783bea0f5f55341792b420ac529b1384e8a98e3cc95e5239ef7e473826022c784fb6933d4606cd5fe1608751a4104401d2983cb66b449e4998f8abd8b16c7"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb19-devel"

RDEPENDS:${PN} += "clang19-devel \
liblldb19 \
llvm19-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
