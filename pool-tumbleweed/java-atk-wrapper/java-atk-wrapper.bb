SUMMARY = "Java ATK Wrapper"
DESCRIPTION = "Java ATK Wrapper is a implementation of ATK by using JNI technic. It \
converts Java Swing events into ATK events, and send these events to \
ATK-Bridge. \
 \
JAW is part of the Bonobo deprecation project. It will replaces the \
former java-access-bridge. \
By talking to ATK-Bridge, it keeps itself from being affected by the \
change of underlying communication mechanism."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.0"

RPM_NAME = "java-atk-wrapper-0.44.0-1.6.aarch64.rpm"
RPM_HASH = "68241b2d4886a56f4d9e058a25dcbe2d4b357e069b51ead84337fc3b6b51eb5239ae977124e353e99200769a4f14f3cc7a271660fcffbcbea0045e9948a6585b"

RPROVIDES:${PN} += "java-atk-wrapper \
libatk-wrapper.so"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xprop"

inherit rpm
