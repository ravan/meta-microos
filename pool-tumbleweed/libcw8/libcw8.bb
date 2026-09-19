SUMMARY = "Libraries for CW programs"
DESCRIPTION = "Unixcw is a project providing libcw library and a set of programs using the \
library: cw, cwgen, cwcp and xcwcp. The programs are intended for people who \
want to learn receiving and sending Morse code. unixcw is developed and tested \
on GNU/Linux system. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.1"

RPM_NAME = "libcw8-3.6.1-1.7.aarch64.rpm"
RPM_HASH = "19e0bd83a0dee75019bca9bee817590a6608b8a933563b83115f2bd7a1f47f57c108160dceb8481242887cce7026fbd13aca2535ab53dedd1be1965a958dc9ed"

RPROVIDES:${PN} += "libcw.so.8 \
libcw8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
