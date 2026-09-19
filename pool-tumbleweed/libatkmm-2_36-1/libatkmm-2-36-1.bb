SUMMARY = "C++ Binding for the ATK library -- Shared Library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides the ATK library's C++'s bindings shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.36.4"

RPM_NAME = "libatkmm-2_36-1-2.36.4-1.3.aarch64.rpm"
RPM_HASH = "fffea6f8cc035bd4bf184c84f0901b61151b870fc1975607e2ebbdcfde61f8e72e705d88c935084e41dbe62553715b1a3430af404d6a3db854496ac40129bf93"

RPROVIDES:${PN} += "libatkmm-2-36-1 \
libatkmm-2.36.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
