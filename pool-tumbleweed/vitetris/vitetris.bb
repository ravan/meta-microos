SUMMARY = "Terminal-based Tetris clone"
DESCRIPTION = "Vitetris is a terminal-based Tetris game. It can be played by one or \
two players, over the network or on the same keyboard. \
 \
Vitetris comes with customizable appearance and netplay where both \
players can choose difficulty (level and height). (No sound, though.) \
 \
Rotation, scoring, levels and speed resembles the early Tetris \
games by Nintendo, with the addition of a short lock delay which \
makes it possible to play at higher levels. (It does not make it \
possible to prevent the piece from ever locking by abusing lock delay \
resets.)"
LICENSE = "BSD-2-Clause"

PV = "0.59.1"

RPM_NAME = "vitetris-0.59.1-3.8.aarch64.rpm"
RPM_HASH = "bd050d3910c90e5c7a013757dca582497c107cd5adf0186620699ab51fcd85e62ca1be44a4af4f15b8788948dba511c74fafefcde531163c2bd8d2db17f24a06"

RPROVIDES:${PN} += "vitetris"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
