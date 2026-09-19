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

RPM_NAME = "libqqwing2-1.3.4-2.31.aarch64.rpm"
RPM_HASH = "f812dbff25d2bfd99092d96d7660edfb6917523db657916cbb262e8fbd1af720fdc3b8e30d0e1b87f2c9cc162c88a5bf65dc6b4cfd56e9cd274b73a48125517b"

RPROVIDES:${PN} += "libqqwing.so.2 \
libqqwing2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
