SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB. \
 \
This package is a dummy package that depends on the version of \
lldb-devel that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "lldb-devel-23-1.1.aarch64.rpm"
RPM_HASH = "73a45ac9fc554f378e25be08bb01308d146fa8f9cc4a9335b29cc02e7f8115b6e654138a5c84f62cdabb6833229be5652e88f71e5a5c90df481728c611a6f940"

RPROVIDES:${PN} += "lldb-devel"

RDEPENDS:${PN} += "lldb \
lldb23-devel"

inherit rpm
