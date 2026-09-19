SUMMARY = "Access lilypond fragments and glyphs, in LaTeX"
DESCRIPTION = "The package provides the means to include arbitrary elements of \
Lilypond notation, including symbols from Lilypond's Emmentaler \
font, in a LaTeX document. The package uses OpenType fonts, and \
as a result must be compiled with LuaLaTeX or XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-2026.226.0.0.2.4svn56473-61.2.noarch.rpm"
RPM_HASH = "fd0f04190c97addc0db420cf93e9bb407b3d6e2b03049d315d4ff82d1a31fd8859d74c160132951986116b8bbc8056c5c6eab88f010058070436a29937dd5d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lilyglyphs.sty \
texlive-lilyglyphs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-keyval.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lilyglyphs-bin \
texlive-lilyglyphs-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
