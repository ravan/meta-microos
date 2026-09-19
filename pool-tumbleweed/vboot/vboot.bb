SUMMARY = "Chromium vboot"
DESCRIPTION = "VBoot contains verified boot reference implementation and \
helper tools for Chrome OS devices."
LICENSE = "BSD-3-Clause"

PV = "78.12499"

RPM_NAME = "vboot-78.12499-6.9.aarch64.rpm"
RPM_HASH = "5f5db123bda1ac28ff86ecfd4217cc77950c5ae22c4d38b863a07c122280a9736acdff980a4baebf77400d37899854fda12be2a67a7174270ec59c43e44f34d9"

RPROVIDES:${PN} += "vboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1"

inherit rpm
