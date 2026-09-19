SUMMARY = "System utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used system-related \
classes and functions, like OS version parser, paths utilities or MIME \
detector."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-sys-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "55d15e90b1886c1053a582bcbdabcea1e95ac04f4366588c0eda8d24cbc8efd9bd3c431e071f8c64c8c8329fffbe1f14df6c26f53ab777633acbd645182ec03d"

RPROVIDES:${PN} += "libleechcraft-util-sys-qt6-0-6-75 \
libleechcraft-util-sys-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
