SUMMARY = "Bidi functions for LuaTeX"
DESCRIPTION = "The package attempts to emulate the XeTeX bidi package, in the \
context of LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn68432"

RPM_NAME = "texlive-luabidi-2026.226.0.0.6svn68432-59.2.noarch.rpm"
RPM_HASH = "a20414089ae63511590faedfbda6f46739ee75c224533fe392a481dac92365f91460dae7746b88f510ac011c6e72fc09c811424e11db1fadb38a42cb2d4ca213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luabidi-arabmaths.def \
tex-luabidi-autofootnoterule.def \
tex-luabidi-footnotes.def \
tex-luabidi-test-arabmaths.tex \
tex-luabidi.sty \
texlive-luabidi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
