SUMMARY = "Development files for STK, a music synthesis library"
DESCRIPTION = "The libstk-devel package contains libraries and header files for \
developing applications that use stk."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "stk-devel-4.6.2-1.14.aarch64.rpm"
RPM_HASH = "ce77dc4ea06952fae6ef01506f0ebcce6f61843e698a3f44e077c97df43c290e57655be31ba5dd3a5400a63e4b9dec19a41c1613220f9b1ecf6d05809d488645"

RPROVIDES:${PN} += "libstk-devel \
stk-devel"

RDEPENDS:${PN} += "libstk4.6.2"

inherit rpm
