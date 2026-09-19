SUMMARY = "Development files for libxcfun"
DESCRIPTION = "The xcfun-devel package contains libraries and header files for \
developing applications that use libxcfun."
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "xcfun-devel-2.1.1-1.22.aarch64.rpm"
RPM_HASH = "fa6de0a6311426d6b86599ec8b6b70432b7484e0b11840b40cac9c202e2eeda774dc5e078ff4f60a75dd62f0befceeb45b80fb5d8852517984f1cbfacc15f053"

RPROVIDES:${PN} += "cmake-XCFun \
xcfun-devel"

RDEPENDS:${PN} += "libxcfun2"

inherit rpm
