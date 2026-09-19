SUMMARY = "Hexeditor with a Diff-mode for ncurses"
DESCRIPTION = "DHEX is just another Hexeditor with a Diff mode for ncurses. It makes \
heavy use of colors and is themeable."
LICENSE = "GPL-2.0-or-later"

PV = "0.69"

RPM_NAME = "dhex-0.69-2.9.aarch64.rpm"
RPM_HASH = "57f84394f4c972b8c9c1b6a4834669df7a5abd32bbfa99b0cc25835bebeceb67ee3c8569c4044a5a6000b110220f453c125b69d504629dfe6df57a1d98bb98bf"

RPROVIDES:${PN} += "dhex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
