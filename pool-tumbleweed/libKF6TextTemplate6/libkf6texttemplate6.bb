SUMMARY = "Core library for ktexttemplate"
DESCRIPTION = "Library to allow application developers to separate the structure of documents \
from the data they contain."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6TextTemplate6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "09dcbdbe3155585e2b956193cdd41b19fade5288732ce5bbd89e857265e74882a00ce9ea199e35f6f0669b8f10d6b39cca01c587fe8751433395a24c153cc222"

RPROVIDES:${PN} += "libKF6TextTemplate.so.6 \
libKF6TextTemplate6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-ktexttemplate \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
