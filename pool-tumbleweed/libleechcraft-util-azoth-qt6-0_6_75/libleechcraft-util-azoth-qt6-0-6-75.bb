SUMMARY = "Messenger utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used messenger-related \
classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-azoth-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "361b0a7ee898e38d619cc06bab57e964771136a358d5ed3f0f227d596c74c930f1a976a1bc3f882e35a830d5b5bd5ca17595a21481b0929c3ff8342ee081ee23"

RPROVIDES:${PN} += "libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-azoth-qt6-0-6-75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
