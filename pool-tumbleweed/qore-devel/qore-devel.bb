SUMMARY = "Header files needed to compile programs using the qore library"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language. \
 \
This package provides header files needed to compile client programs using the \
Qore library."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "qore-devel-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "d836ced368980699bab9698c6777c0372a92477796ff632a49f7f1ede1f15569b9706e9432187113d6608dd59fddaeb1f8c8dbeb00a322b8bc602efa19648126"

RPROVIDES:${PN} += "pkgconfig-qore \
qore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm
