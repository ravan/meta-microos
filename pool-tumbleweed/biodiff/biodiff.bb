SUMMARY = "A tool for binary diffing"
DESCRIPTION = "Hex diff viewer using alignment algorithms from biology. \
 \
The tool is able to show two binary files side by side so that similar \
places will be at the same position on both sides and bytes missing \
from one side are padded. It uses bio-informatics algorithms from the \
rust-bio library (typically used for DNA sequence alignment) for that. \
 \
Features \
 - Unaligned view for moving both sides independently as contiguous \
   byte segments. \
 - Aligned view for comparing corresponding bytes of both files. \
 - Many configurable byte representations (bases 2, 8, 10, 16; \
   mixed ascii/hex, braille, roman numerals). \
 - Right-to-left mode, horizontal and vertical split, ascii and bar \
   column. \
 - bytes per row, adjustable by pressing [, ], 0. \
 - Automatic determination of width by finding repetitions in \
   visible/selected bytes by pressing '='. \
 - Search using text, regex and hexagex."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "biodiff-1.2.1-1.9.aarch64.rpm"
RPM_HASH = "7f34d434a901f29c95c2109feb1c5132ce5fa476bf2d648babd6e0161eadbc636070ca7f2b681352ecd503e5f718c7163061a6714dac29ac9748a4c4648ca1f2"

RPROVIDES:${PN} += "biodiff"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
