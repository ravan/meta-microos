SUMMARY = "Using the OpenType fonts TeX Gyre Pagella"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Pagella' for \
text and math. The missing typefaces like bold math and slanted \
text are also defined"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn77682"

RPM_NAME = "texlive-pagella-otf-2026.226.0.0.02svn77682-58.2.noarch.rpm"
RPM_HASH = "e1202fc782bac4bb373122222075b0798063c0b9aaf33008c8ebe3938ba1e17a603d0f40b67b15957f515bb2f4066a87bf52625fb27449b2ba9a788543e80777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagella-otf.sty \
texlive-pagella-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
