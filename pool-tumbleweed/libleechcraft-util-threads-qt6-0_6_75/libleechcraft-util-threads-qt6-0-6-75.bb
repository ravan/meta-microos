SUMMARY = "Thread utility library for LeechCraft"
DESCRIPTION = "A library providing some classes and functions commonly used \
with the LeechCraft threads subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-threads-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "cfbe18b155917ce78aab07ecd8fa118281122f2638405a18a1257a925ea205454497eb0892957ca61146744f561f725a7262526328b66b73e082c15cd42f7b6f"

RPROVIDES:${PN} += "libleechcraft-util-threads-qt6-0-6-75 \
libleechcraft-util-threads-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
