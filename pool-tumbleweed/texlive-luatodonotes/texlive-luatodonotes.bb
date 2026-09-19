SUMMARY = "Add editing annotations in a LuaLaTeX document"
DESCRIPTION = "The package allows the user to insert comments into a document \
that suggest (for example) further editing that may be needed. \
The comments are shown in the margins alongside the text; \
different styles for the comments may be used; the styles are \
selected using package options. The package is based on the \
package todonotes, and depends heavily on Lua, so it can only \
be used with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5asvn77682"

RPM_NAME = "texlive-luatodonotes-2026.226.0.0.5asvn77682-59.2.noarch.rpm"
RPM_HASH = "ed58cc9c01aaebf0ed8b8e37ca6d0cf558416aa847f4818ceaf74ebb5e0c04e8d14da4022eab2815aa0d617126c443ab22de6781d220f185716143311d01147a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatodonotes.sty \
texlive-luatodonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifoddpage.sty \
tex-ifthen.sty \
tex-luacode.sty \
tex-soul.sty \
tex-soulpos.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
