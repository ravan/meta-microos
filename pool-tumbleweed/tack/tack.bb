SUMMARY = "Terminfo action checker"
DESCRIPTION = "This package contains the tack utility to help to build a new terminfo \
entry describing an unknown terminal. It can also be used to test the \
correctness of an existing entry, and to develop the correct pad \
timings needed to ensure that screen updates do not fall behind the \
incoming data stream."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.20251210"

RPM_NAME = "tack-1.11.20251210-111.1.aarch64.rpm"
RPM_HASH = "b30efcf6203a02e4b31ec30e9cb3b4642806fa683bda318c595900306003597b27a3c34a61864ec43f93e4889756d0e1e04c0cdad7a5551ee19598ac3d2ae4d2"

RPROVIDES:${PN} += "ncurses-devel-/usr/bin/tack \
tack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
ncurses"

inherit rpm
