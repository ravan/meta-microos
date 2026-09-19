SUMMARY = "Records Videos of Terminal Output"
DESCRIPTION = "Termrec is a program for recording 'videos' of terminal output. \
 \
Utilities provided are \
- termplay the player. \
- termrec the console recorder. Allows you to capture the output \
of a console program. \
- proxyrec a telnet proxy. Will capture the session to a file. \
- termtime takes one of more ttyrecs. Measures their lengths. \
Prints that. \
- termcat copies a ttyrec, possibly converting it to a different \
format and/or combining several ttyrecs together."
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "termrec-0.19-1.24.aarch64.rpm"
RPM_HASH = "2c49a13f321c8447e26059e0c2717efe442cbd1070b785078af43b20de331c30814310dc5ad4b06fb5712c4fa7b3b3c3875c649f75def4cd46a967e6d402685a"

RPROVIDES:${PN} += "termrec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtty.so.1 \
libtty1"

inherit rpm
