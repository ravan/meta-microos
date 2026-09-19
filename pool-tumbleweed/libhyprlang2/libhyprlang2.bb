SUMMARY = "Library for Hypr, a config language"
DESCRIPTION = "The hypr configuration language is a configuration language for Linux \
applications."
LICENSE = "LGPL-3.0-only"

PV = "0.6.7"

RPM_NAME = "libhyprlang2-0.6.7-1.6.aarch64.rpm"
RPM_HASH = "fb878c14ff33f0e434f6ab36e32f457430b270e351abcc62bc70d7e7f111b70fa3c7b36e5d737c0f7857e04957c67e68e6e1931b2a8fea79ddac3192f68592c5"

RPROVIDES:${PN} += "libhyprlang.so.2 \
libhyprlang2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhyprutils.so.13 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
