SUMMARY = "Universal Source Code to Formatted Text Converter"
DESCRIPTION = "A utility that converts sourcecode to HTML, XHTML, RTF, LaTeX, TeX, XML or ANSI \
escape sequences with syntax highlighting. \
It supports several programming and markup languages. \
Language descriptions are configurable and support regular expressions. \
The utility offers indentation and reformatting capabilities. \
It is easily possible to create new language definitions and colour themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-4.18-1.6.aarch64.rpm"
RPM_HASH = "f86eb3796c34b9c48144498c0a602dc36667f59d5a30255a524b58a264c0e96e318d71d38d50e2f02ce305df13c8bea0a3e70b4d6a5059406a9fdee0b650fa21"

RPROVIDES:${PN} += "highlight"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
