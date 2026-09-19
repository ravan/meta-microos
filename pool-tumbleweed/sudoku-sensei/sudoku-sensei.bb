SUMMARY = "Enjoy playing with Sudoku boards designed by yourself"
DESCRIPTION = "The engine solves sudokus by applying complex logical rules a few times, \
instead of applying simpler rules (like guessing and backtracking) \
many many times. These complex logical rules are exactly the same ones \
that people use with paper and pen."
LICENSE = "GPL-2.0-or-later"

PV = "02_00"

RPM_NAME = "sudoku-sensei-02_00-4.11.aarch64.rpm"
RPM_HASH = "fa73a0b98ae972e147ed7ffc48b366ed79dbe4291173a828119b865e5471b195e29f37f5c5ce882fc915fa48d82afc4f471832b1607b671d938e894e352bd7df"

RPROVIDES:${PN} += "sudoku-sensei"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
