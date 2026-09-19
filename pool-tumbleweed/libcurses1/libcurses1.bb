SUMMARY = "Library for old curses"
DESCRIPTION = "This library of old curses"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "libcurses1-1.0.0-1050.6.aarch64.rpm"
RPM_HASH = "d2e1ae2741141e7b0c65b27d7f7bb68b32cb76ad9a3f357c0cf1f9e811789c346cdf65bceec10d863fd83a1e39aa865f3432a53a423b66ad0af1b3f52a08e0cc"

RPROVIDES:${PN} += "libcurses.so.1 \
libcurses1 \
termcap-/usr/lib64/libcurses.so.1.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtermcap.so.2"

inherit rpm
