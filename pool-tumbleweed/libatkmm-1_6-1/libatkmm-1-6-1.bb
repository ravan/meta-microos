SUMMARY = "C++ Binding for the ATK library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort."
LICENSE = "LGPL-2.1-or-later"

PV = "2.28.5"

RPM_NAME = "libatkmm-1_6-1-2.28.5-1.3.aarch64.rpm"
RPM_HASH = "6966079ac661e998b97ac7aad8c8a90c4bad25e97316dcf9f8eb5046981e1ad0f37761747e3df3de09606225c404e20c828f3d380f6dbebe960a817572362b85"

RPROVIDES:${PN} += "libatkmm-1-6-1 \
libatkmm-1.6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
