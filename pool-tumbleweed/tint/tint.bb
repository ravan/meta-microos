SUMMARY = "A Clone of the Original Tetris Game"
DESCRIPTION = "TINT is a clone of the original tetris game written by Alexey Pajitnov, Dmitry \
Pavlovsky, and Vadim Gerasimov. The game is close to the original, but \
there are a few differences."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "tint-0.07-1.16.aarch64.rpm"
RPM_HASH = "fcf310a12ad1bbca136c5333bf3d962806ef33db6c1b739a099a9085716392c2ff76867ca20ae4f484e4c6feb9b2c2bb7ced36749e21f9c2ed5b02f47f0d46aa"

RPROVIDES:${PN} += "tint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
