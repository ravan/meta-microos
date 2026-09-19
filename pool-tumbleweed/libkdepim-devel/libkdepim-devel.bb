SUMMARY = "Development package for libkdepim"
DESCRIPTION = "The development package for the libkdepim libraries"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkdepim-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "050574f6bfe9216a62eeea96193a8099cfa6dfa2f15489c9787341acfae8672f281c576d420c8dc6b888a51c0b4c35e1f49af579aba786963a2f07f1f5ae550b"

RPROVIDES:${PN} += "cmake-KPim6Libkdepim \
cmake-KPim6MailTransportDBusService \
libkdepim-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPim6Libkdepim.so.6 \
libKPim6Libkdepim6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
