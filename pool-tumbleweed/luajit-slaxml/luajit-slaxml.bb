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

RPM_NAME = "luajit-slaxml-0.7+git20230101.756ffad-2.2.noarch.rpm"
RPM_HASH = "72c2f940f9fa54d247cbaa48952344e99bb07dae9ceb861a5f6638e86b78f5f5e1d1688737e174c7bf2e9f45771ae95c7879732ae9bab272734d1728ec0ff853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-slaxml"

RDEPENDS:${PN} += "luajit"

inherit rpm
