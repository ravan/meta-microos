SUMMARY = "Original puzzle of Nikoli"
DESCRIPTION = "Hitori is played with a grid of squares or cells, and each cell contains a number. \
The objective is to eliminate numbers by filling in the squares such that remaining cells do not \
contain numbers that appear more than once in either a given row or column. \
 \
Filled-in cells cannot be horizontally or vertically adjacent, although they can be diagonally \
adjacent. The remaining un-filled cells must form a single component connected horizontally \
and vertically."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "hitori-44.0-1.15.aarch64.rpm"
RPM_HASH = "b83865eee96486fbb5dd3c2fe22edeee6e3853c4fee09457c53aed580c3c50fef83a7f0a112cdd7e411cc822e6f9664d39ffa2d0a169c07c412d0784c152de35"

RPROVIDES:${PN} += "hitori"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
