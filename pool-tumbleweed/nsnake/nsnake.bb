SUMMARY = "Classic snake game on the terminal"
DESCRIPTION = "nsnake is a clone of the classic snake game that we all used to play on our \
cellphones. You play this game on the terminal, with textual interface. \
 \
Here are some features: \
 \
- Customizable gameplay, appearance and keybindings \
- Neat GUI-like interface with nice animations \
- Lots of possible game modes, with scores saved for eac"
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "nsnake-3.0.1-3.9.aarch64.rpm"
RPM_HASH = "3e53ca965caa00f9a4b394e5a796d9ceac22f20123651d3ca82d8f877d41dcbb0cb9a655ea6e8939d393bcd61f1a9e2bdf70854d0919251f1b73e3800822c0c3"

RPROVIDES:${PN} += "nsnake"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
