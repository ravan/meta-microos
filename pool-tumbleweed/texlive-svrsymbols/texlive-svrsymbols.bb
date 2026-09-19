SUMMARY = "A font with symbols for use in physics texts"
DESCRIPTION = "The svrsymbols package is a LaTeX interface to the SVRsymbols \
font. The glyphs of this font are ideograms that have been \
designed for use in physics texts. Some symbols are standard \
and some are entirely new."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-2026.226.2.0bsvn50019-64.2.noarch.rpm"
RPM_HASH = "3df518b4ac95c725a48824200144bd91246f487e83107f525feb074980e8758f9314305e6141b19215e10c30da0f1ce491476dc16f27610e3eb3b9e11570864d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SVRsymbols.tfm \
tex-svrsymbols.map \
tex-svrsymbols.sty \
texlive-svrsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svrsymbols-fonts"

inherit rpm
