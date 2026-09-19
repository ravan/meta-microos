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

RPM_NAME = "lua53-slaxml-0.7+git20230101.756ffad-2.2.noarch.rpm"
RPM_HASH = "5d38ba95f674168e60bed2704416602a9b4f7c114bbd425b0f19d45aa9b0e576fb52d5998b48842a5c5f2bf5d64ed5e4eff98f87cf2cff32c6c2fb923512bd41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-slaxml"

RDEPENDS:${PN} += "lua53"

inherit rpm
