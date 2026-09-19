SUMMARY = "Documentation for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation."
LICENSE = "LGPL-3.0-or-later"

PV = "3.39.0"

RPM_NAME = "liblouis-doc-3.39.0-1.1.aarch64.rpm"
RPM_HASH = "34e980a927a02ce51af7292b350e195469ebd3681e6d62a5a7b7dd50e319d41b8913c5f2e58ec47df822fd00ce31bd792a5a1624d2ea0b15ed0dd5b80af37b61"

RPROVIDES:${PN} += "liblouis-doc"

RDEPENDS:${PN} += ""

inherit rpm
