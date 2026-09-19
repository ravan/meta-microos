SUMMARY = "Support for the TrueType font JuliaMono"
DESCRIPTION = "JuliaMono is a monospaced font for scientific and technical \
computing. There are font files for Regular, Italic, Bold and \
BoldItalic in light, medium, black and extra bold version. \
There are more than 12 thousand glyphs in every font file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn77682"

RPM_NAME = "texlive-juliamono-2026.226.0.0.06svn77682-63.2.noarch.rpm"
RPM_HASH = "fa39f14fa8bbc6634e645478ebaec81c990370727fc8d51e22ffe232e13f5e36824c6a152a9adeb6a949f4014712017df7b0b822b17688e66c3a85687f8f8b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-juliamono.sty \
texlive-juliamono"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-juliamono-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
