SUMMARY = "Development files for xylib"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use xylib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "xylib-devel-1.6-1.30.aarch64.rpm"
RPM_HASH = "0608607550a27c0f19a9d4aa9abb0e271844c203f034b485af5f1c4b1f27fb3fb9ff619a4f89d6ee42212a09addd5bacc8f128f497489700781dd2656d20ce04"

RPROVIDES:${PN} += "xylib-devel"

RDEPENDS:${PN} += "libxy3"

inherit rpm
