SUMMARY = "XDG utility library for LeechCraft"
DESCRIPTION = "A library providing XDG parsers and other support methods and classes \
for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-xdg-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "7dfe6366b6776aa1491ce266bb15ba1a50389f34d9ddf9270e55ca5225c1eac80f041c9f39be66b63034fb6a81ca65afe43c517a2461e7bb51809a99c59408da"

RPROVIDES:${PN} += "libleechcraft-util-xdg-qt6-0-6-75 \
libleechcraft-util-xdg-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
