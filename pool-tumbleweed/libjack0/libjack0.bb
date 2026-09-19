SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack0-1.9.22-5.5.aarch64.rpm"
RPM_HASH = "37a0acd53c15daf161dd399cd552da7e4032b7feef389913dfdb29b1f82eb3396cf470b6728304d30f77bbfbc4c31ce9854b2debe8c25c51161ee3458e07dcfc"

RPROVIDES:${PN} += "libjack \
libjack.so.0 \
libjack0 \
libjack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
