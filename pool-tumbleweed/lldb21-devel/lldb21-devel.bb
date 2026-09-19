SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "lldb21-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "fa4521ca02d898180df75b23952adf99650a3438f36732b4377c3c547b1659fe69df155060bff686b31893d2cbd2ad1513b53b8e241f6a879d0d3f10bcdc0ca3"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb21-devel"

RDEPENDS:${PN} += "clang21-devel \
liblldb21 \
llvm21-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
