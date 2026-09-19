SUMMARY = "MVC utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used models (as in MVC), \
as well as model-related classes and functions. \
widgets, classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-models-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3517da2a4ec728760e17257071f19b791306e66df97b48b3c62551541b5f16f7c51a500b5e2bf2a51336bef0abb47163c1f350e2958d46925554262701acff6c"

RPROVIDES:${PN} += "libleechcraft-util-models-qt6-0-6-75 \
libleechcraft-util-models-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
