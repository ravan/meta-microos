SUMMARY = "Sudoku solver and generator"
DESCRIPTION = "QQwing is a Sudoku puzzle generator and solver. It offers the following features. \
 \
 * Fast. It can solve 1000 puzzles in 1 second and generate 1000 puzzles in 25 seconds. \
 * Uses logic. Uses as many solve techniques as possible when solving puzzles rather than guessing. \
 * Rates puzzles. Most generators don't give an indication of the difficulty of a Sudoku puzzle. QQwing does. \
 * Can print solve instructions. Tells steps that need to be taken to solve any puzzle. \
 * Customizable output style. Including a CSV style that is easy to import into a database."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.4"

RPM_NAME = "qqwing-1.3.4-2.31.aarch64.rpm"
RPM_HASH = "e7507dd743471a7c92b121b7888c4f637cc29a094b22c48469f4fb5d8043da38c179e5bfb59e23a561a41fc7b296db59914d9bffa5b836a75e0145bb9ca42ec9"

RPROVIDES:${PN} += "qqwing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqqwing.so.2 \
libstdc++.so.6"

inherit rpm
