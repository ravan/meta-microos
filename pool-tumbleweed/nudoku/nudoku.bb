SUMMARY = "Ncurses based sudoku game"
DESCRIPTION = "nudoku is a ncurses based sudoku game."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "nudoku-8.0.1-1.2.aarch64.rpm"
RPM_HASH = "33608ada12158b850b7fceaaef97cdb3d0359cf1e9dbddfe073c4822e17698db90ba68ffba4c126ac809ec02faedcbd67dae33afa65c5aa8dc249e59b4e9658f"

RPROVIDES:${PN} += "nudoku"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
