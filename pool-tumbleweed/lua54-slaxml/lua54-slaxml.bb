SUMMARY = "SAX-like streaming XML parser for Lua"
DESCRIPTION = "SLAXML is a pure-Lua SAX-like streaming XML parser. It is more \
robust than many (simpler) pattern-based parsers that exist \
(such as mine), properly supporting code like \
<expr test='5 > 7' />, CDATA nodes, comments, namespaces, and \
processing instructions. \
 \
It is currently not a truly valid XML parser, however, as \
it allows certain XML that is syntactically-invalid (not \
well-formed) to be parsed without reporting an error."
LICENSE = "MIT"

PV = "0.7+git20230101.756ffad"

RPM_NAME = "lua54-slaxml-0.7+git20230101.756ffad-2.2.noarch.rpm"
RPM_HASH = "61274acf4ebea1fa69408ca789f3dc5f001e102d0cd0a0d4dde8c52d240bf224d3d6c757189c0b1da65dc70bc104240a74adbdf46b735139ced77f60609ac736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-slaxml \
lua54-slaxml"

RDEPENDS:${PN} += "lua54"

inherit rpm
