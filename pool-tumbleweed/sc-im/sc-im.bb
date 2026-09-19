SUMMARY = "An ncurses spreadsheet program for terminal"
DESCRIPTION = "Spreadsheet Calculator Improvised, aka sc-im, is an ncurses based, \
vim-like spreadsheet calculator. \
 \
sc-im is based on sc, whose original authors are James Gosling and \
Mark Weiser, and mods were later added by Chuck Martin."
LICENSE = "BSD-4-Clause"

PV = "0.8.5"

RPM_NAME = "sc-im-0.8.5-1.7.aarch64.rpm"
RPM_HASH = "523903876c7019262a5efb5e9bdf6ef7cbe48c84824c0cecaf740ee4d636101ef691542de47f60be7b9c22a2cd0fe67b5c199f85386419f065c125f7366832c0"

RPROVIDES:${PN} += "sc-im"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libxlsreader.so.8 \
libxml2.so.16 \
libzip.so.5"

inherit rpm
