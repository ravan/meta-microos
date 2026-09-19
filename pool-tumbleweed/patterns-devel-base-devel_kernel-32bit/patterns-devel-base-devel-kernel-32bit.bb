SUMMARY = "Linux Kernel Development"
DESCRIPTION = "The 32bit pattern complementing devel_kernel."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_kernel-32bit-20170319-13.4.aarch64.rpm"
RPM_HASH = "9c6ec30d507aa0d784d94360f0defc5e32bd6c61e76f21a350fb40348033b265c59689d76db4c3cee83db09437c21b2bf66df609134fc6b8ae6ce4e6afc7c817"

RPROVIDES:${PN} += "pattern- \
patterns-devel-base-devel-kernel-32bit"

RDEPENDS:${PN} += ""

inherit rpm
