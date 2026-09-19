SUMMARY = "Enhanced X Window System (32bit)"
DESCRIPTION = "The 32bit pattern complementing x11_enhanced."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-x11_enhanced-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "67dea1737db102f40ad12cab92eec6ac5edf2c2bd19ce8128ad8c8c32b09a9f46dd44045d6c7e4879d41b86f241ce899b175890cc665dbbf4b5041a05eeb5a5d"

RPROVIDES:${PN} += "pattern- \
patterns-base-x11-enhanced-32bit"

RDEPENDS:${PN} += ""

inherit rpm
