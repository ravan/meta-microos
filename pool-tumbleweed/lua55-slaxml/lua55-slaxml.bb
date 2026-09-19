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

RPM_NAME = "lua55-slaxml-0.7+git20230101.756ffad-2.2.noarch.rpm"
RPM_HASH = "dde2c6460215bf40aaa0f5832e1a04cfd51737a1f1971bcc38b600baf51d1b93d3fcb6d9766f95d3229139475ce3422f290b3ac59093f0788c87b6a9589b19dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-slaxml"

RDEPENDS:${PN} += "lua55"

inherit rpm
