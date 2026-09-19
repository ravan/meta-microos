SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "The libmarisa0 package contains runtime libraries for marisa."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "libmarisa0-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "b39fa248f3f33a3a0d10c20760381c41cd6c26e8a6bcd7d9ee8237f79641d68d5fd00cf1eed44b08a75f896d01d25596c24c22fbfb762897d2ea6289ae18bfe5"

RPROVIDES:${PN} += "libmarisa.so.0 \
libmarisa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
