SUMMARY = "Astronomy: Shared Library"
DESCRIPTION = "The astronomy library for the satellites plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libastro1-26.08.1-1.2.aarch64.rpm"
RPM_HASH = "4dbab02737eb792f2b237bb32d25ee66b81756003cc2284bdba6a5648eaf0de00d1ab656c3bd30bad3b49bdbc090105b53ed1caf93f19f0c1b6ae1b0b6c09f32"

RPROVIDES:${PN} += "libastro-qt5-1 \
libastro.so.1 \
libastro1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmarblewidget-qt6-28 \
libstdc++.so.6"

inherit rpm
