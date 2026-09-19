SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based utilities are as follows: \
 \
clear -- emits clear-screen for current terminal \
 \
tabs -- set tabs on a terminal \
 \
toe   -- table of entries utility \
 \
tput  -- shell-script access to terminal capabilities. \
 \
tset  -- terminal-initialization utility \
 \
reset -- terminal initialization utility"
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "ncurses-utils-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "20e8355f27dcbd4bebb6cb807ee9f8d17df72550622fd2730ee90d4a8b731bf644d86250b62ec6eedef77a7a226fb1251fd8feebbaa67c69e4025f780705e7f9"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
