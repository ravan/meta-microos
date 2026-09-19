SUMMARY = "Use the ASCII 'font' in LaTeX"
DESCRIPTION = "The package provides glyph and font access commands so that \
LaTeX users can use the ASCII glyphs in their documents. The \
ASCII font is encoded according to the IBM PC Code Page 437 C0 \
Graphics. This package replaces any early LaTeX 2.09 package \
and 'font' by R. Ramasubramanian and R.W.D. Nickalls."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-ascii-font-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "b683d60b0d65c4203817771c7f59c1b4d67c2b043a7dfde2eb0a8b24e355e275ad2302ab2df376484ad8117ca6ee26c6d7a30910e9254a92916e9b49e7c077c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ASCII.tfm \
tex-ascii.map \
tex-ascii.sty \
texlive-ascii \
texlive-ascii-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xspace.sty \
texlive \
texlive-ascii-font-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
