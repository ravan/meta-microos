SUMMARY = "Development files for KOpeningHours"
DESCRIPTION = "Include files and libraries needed to build programs that use the KOpeningHours \
library."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kopeninghours-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "21880d4cccf3fa4122fcb1b6291396ec6f7382ae2d358f1eea317f3b7c3382cf4e26302b04d999cbadc6f815f9d0a94866676ceab0b4c4a5169432e170320a80"

RPROVIDES:${PN} += "cmake-KOpeningHours \
kopeninghours-devel"

RDEPENDS:${PN} += "libKOpeningHours1"

inherit rpm
