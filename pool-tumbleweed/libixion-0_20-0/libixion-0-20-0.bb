SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "libixion-0_20-0-0.20.0-4.7.aarch64.rpm"
RPM_HASH = "bdeaab45fe4788ef0ce32eb499b529bc2f0126a4f2eec7fe9dfc7e125f22d7dccb7ee8db18037718d210eb9c47c1ba61d37a6c84a891eac36a7dd041f4d8c243"

RPROVIDES:${PN} += "libixion-0-20-0 \
libixion-0.20.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
