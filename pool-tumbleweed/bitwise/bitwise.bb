SUMMARY = "Interactive bit-wise operation in ncurses"
DESCRIPTION = "Bitwise is a multi base interactive calculator supporting dynamic base \
conversion and bit manipulation. It's a handy tool for low level \
hackers, kernel developers and device drivers developers. \
 \
Some of the features include: \
 * Interactive ncurses interface command line calculator. \
 * Individual bit manipulator. \
 * Bitwise operations such as NOT, OR, AND, XOR, and shifts."
LICENSE = "GPL-3.0-or-later"

PV = "0.70"

RPM_NAME = "bitwise-0.70-1.1.aarch64.rpm"
RPM_HASH = "8f279631764aa49d075a4730ff67c31513d69028576131c6f16a0c91076e1ae402481d3648c415a15e6d6e84be7d98bd96f1035e1cb75d3b6aa2a617e686f7fc"

RPROVIDES:${PN} += "bitwise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libformw.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
