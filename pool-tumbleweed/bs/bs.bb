SUMMARY = "Battleships solitaire game with a color interface"
DESCRIPTION = "The classic game of Battleships against the computer. Uses character-cell \
graphics with a visual point-and-shoot interface. If you're using an xterm \
under Linux the mouse will work."
LICENSE = "BSD-2-Clause"

PV = "2.13"

RPM_NAME = "bs-2.13-1.6.aarch64.rpm"
RPM_HASH = "2c0ca20f44830b38f3e8f222b0ff29136a3ae33abdb47e6f1c653686ae37820721e91571ba9550cad21efd73f29478969165fe93891fa32dc9991b4eb9fabdfa"

RPROVIDES:${PN} += "bs"

RDEPENDS:${PN} += "libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
