SUMMARY = "Using the OpenType fonts TeX Gyre Heros>"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Heros'. The \
condensed versions of the fonts are also supported. The missing \
typefaces for slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-heros-otf-2026.226.0.0.01svn77682-60.4.noarch.rpm"
RPM_HASH = "2686b87bb29f35d55cfc0f7aa7d58fd0d783988db469d8cc076ab6a645b01bd41b586afe152a6941a309cc148418c44ae1c33b8526cc424ec3abf0581b90fd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-heros-otf.sty \
texlive-heros-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-textcomp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
