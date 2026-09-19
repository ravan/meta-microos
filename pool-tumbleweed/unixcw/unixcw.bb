SUMMARY = "Libraries and programs for CW"
DESCRIPTION = "Unixcw is a project providing libcw library and a set of programs using the \
library: cw, cwgen, cwcp and xcwcp. The programs are intended for people who \
want to learn receiving and sending Morse code. unixcw is developed and tested \
on GNU/Linux system."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.1"

RPM_NAME = "unixcw-3.6.1-1.7.aarch64.rpm"
RPM_HASH = "3046cc1be6e717aaa9739604014a3fd623838967608ac5777c9276c52cccddfa93ec8262160ca08e72ba71e2638a1b990e1b8636143ffeafda69b7e6ec312295"

RPROVIDES:${PN} += "unixcw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcw.so.8 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
