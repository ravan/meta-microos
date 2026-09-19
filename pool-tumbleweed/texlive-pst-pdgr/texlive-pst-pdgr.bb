SUMMARY = "Draw medical pedigrees using PSTricks"
DESCRIPTION = "The package provides a set of macros based on PSTricks to draw \
medical pedigrees according to the recommendations for \
standardized human pedigree nomenclature. The drawing commands \
place the symbols on a pspicture canvas. An interface for \
making trees is also provided. The package may be used both \
with LaTeX and PlainTeX. A separate Perl program for generating \
TeX files from spreadsheets is available."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-2026.226.0.0.4svn45875-60.4.noarch.rpm"
RPM_HASH = "5e51fced3711757996fc0c2db553102fe9626c175ccb88e5fbe4ccd1225a76416018169422bbf5516c825a40460b27f42e54cdeb62e62c05af850c2cd6e4a5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pdgr.cfg \
tex-pst-pdgr.sty \
tex-pst-pdgr.tex \
texlive-pst-pdgr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
