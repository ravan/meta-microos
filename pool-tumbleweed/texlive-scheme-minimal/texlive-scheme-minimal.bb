SUMMARY = "Minimal scheme (plain only)"
DESCRIPTION = "This is the minimal TeX Live scheme, with support for only \
plain TeX. (No LaTeX macros.) LuaTeX is included because Lua \
scripts are used in TeX Live infrastructure. This scheme \
corresponds exactly to collection-basic."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54191"

RPM_NAME = "texlive-scheme-minimal-2026.222.svn54191-68.2.noarch.rpm"
RPM_HASH = "57b714f54899c3ba1f76e295c76f88ff094296d42179ec5ae0672abaef900f837ce383211c5553747ad2ac1ccce98b6a5c78c4430425ead34b873395fd56fae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-minimal \
texlive-scheme-minimal"

RDEPENDS:${PN} += "texlive-collection-basic"

inherit rpm
