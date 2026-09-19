SUMMARY = "Font with Support for Symbol Blocks of the Unicode Standard"
DESCRIPTION = "Symbola covers the following scripts and symbols supported by Unicode: Basic Latin, IPA Extensions, Spacing Modifier Letters, Combining Diacritical Marks, Greek and Coptic, Cyrillic, Cyrillic Supplement, General Punctuation, Superscripts and Subscripts, Currency Symbols, Combining Diacritical Marks for Symbols, Letterlike Symbols, Number Forms, Arrows, Mathematical Operators, Miscellaneous Technical, Control Pictures, Optical Character Recognition, Box Drawing, Block Elements, Geometric Shapes, Miscellaneous Symbols, Dingbats, Miscellaneous Mathematical Symbols-A, Supplemental Arrows-A, Supplemental Arrows-B, Miscellaneous Mathematical Symbols-B, Supplemental Mathematical Operators, Miscellaneous Symbols and Arrows, Supplemental Punctuation, Yijing Hexagram Symbols, Combining Half Marks, Specials, Byzantine Musical Symbols, Musical Symbols, Ancient Greek Musical Notation, Tai Xuan Jing Symbols, Counting Rod Numerals, Mathematical Alphanumeric Symbols, Mahjong Tiles, Domino Tiles, Playing Cards, Miscellaneous Symbols And Pictographs, Emoticons, Transport And Map Symbols, Alchemical Symbols, et al."
LICENSE = "SUSE-Permissive"

PV = "10.23"

RPM_NAME = "gdouros-symbola-fonts-10.23-2.15.noarch.rpm"
RPM_HASH = "84bdb6596b3bf300e3d7f1b23505e0956e2ea96056a161559e800010ffc7e52417940a209665da72b416f4f3a2065e0610a4770b5191f0ab00ea869f27b703ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-symbola-fonts \
symbola-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
