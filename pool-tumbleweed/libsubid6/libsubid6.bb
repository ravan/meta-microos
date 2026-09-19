SUMMARY = "A library to manage subordinate uid and gid ranges"
DESCRIPTION = "Utility library that provides a way to manage subid ranges."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "libsubid6-4.20.2-2.1.aarch64.rpm"
RPM_HASH = "5fc08092b745a39693cd11004ac22504e6b4166147465c5be405d4c016303f87b9caa4523627007def8d6013f0786fd538d56dbfa336f3eadd116644758e0eb8"

RPROVIDES:${PN} += "libsubid.so.6 \
libsubid6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
