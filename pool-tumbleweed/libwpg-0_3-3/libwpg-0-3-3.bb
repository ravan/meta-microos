SUMMARY = "Library to read and parse graphics in WordPerfect Graphics format"
DESCRIPTION = "libwpg is a C++ library to read and parse graphics in WPG (WordPerfect \
Graphics) format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-0_3-3-0.3.4-2.12.aarch64.rpm"
RPM_HASH = "abb090f47a080e9808d7228b57cfab73ae12ce931567ccbcf1de58698e14abb478c1dd07554df5cd16fe004f458def22d25f009227ca761b2fdb6d8353a2fc36"

RPROVIDES:${PN} += "libwpg-0-3-3 \
libwpg-0.3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libwpd-0.10.so.10"

inherit rpm
