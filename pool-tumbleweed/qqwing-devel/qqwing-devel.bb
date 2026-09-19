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

RPM_NAME = "qqwing-devel-1.3.4-2.31.aarch64.rpm"
RPM_HASH = "0c721b39ac749c4fbd70684957a057f211bebae39fb2896fc5fdf328769716274b317a75a17f0c90ebddae059cae7cac8a7b5b72dab02e7d123934d96ded3504"

RPROVIDES:${PN} += "pkgconfig-qqwing \
qqwing-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqqwing2"

inherit rpm
