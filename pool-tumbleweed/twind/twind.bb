SUMMARY = "Match and remove all of the blocks before time runs out"
DESCRIPTION = "The object of the game is to remove all of the blocks from the screen \
before the time runs out. Two blocks are removed at a time, \
and must be of the same color. After completing a level, \
you will be rewarded with a bonus point for every tick left on the clock. \
For each level thereafter, the time to complete the the level will be shorter. \
 \
Shortcut Keys Used During the Game \
 \
 b - change the block set \
 c - change the corner style of the blocks \
 f, F4 - toggle between full screen/window mode (can be used anywhere) \
 h, F1 - display the help screen \
 m - turn background music on/off (can be used anywhere) \
 n, F2 - start a new game (highscores won't be saved ending a game this way) \
 p, Pause, F3 - pause/unpause the game \
 q, Esc - quit the game \
 s - turn sound effects on/off (can be used anywhere) \
 0 - 9 - toggle the L & R colors on Insane mode (can be used anywhere)"
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "twind-1.1.0-5.6.aarch64.rpm"
RPM_HASH = "6f61f9262e095241605d478abee99be96aa0177c9850a845c2820b8b1a69bbcbd2fcd81610954e158cd1557784b5446e4f569bff2a0676edadea8805ef3a13c3"

RPROVIDES:${PN} += "twind"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
