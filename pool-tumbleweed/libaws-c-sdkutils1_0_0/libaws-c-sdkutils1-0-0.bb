SUMMARY = "AWS C SDK Utils"
DESCRIPTION = "AWS C SDK Utils \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.2.10"

RPM_NAME = "libaws-c-sdkutils1_0_0-0.2.10-1.1.aarch64.rpm"
RPM_HASH = "8d907218e210fde83f99f6bcc6dfbbbf27f5673c4d8bf640fd8cc79a9bab895710a9dbd945e899f2699ce93f0d4d9589433c9020a6b35cb9b2a7854e1b725bcd"

RPROVIDES:${PN} += "libaws-c-sdkutils.so.1.0.0 \
libaws-c-sdkutils1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libc.so.6"

inherit rpm
