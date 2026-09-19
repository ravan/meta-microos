SUMMARY = "Commands for Scrabble boards"
DESCRIPTION = "This package provides some commands (in English and in French) \
to work with a Scrabble Board : \\ScrabbleBoard and \
\\begin{EnvScrabble} and \\ScrabblePutWord for the English \
version, \\PlateauScrabble and \\begin{EnvScrabble} and \
\\ScrabblePlaceMot for the French version."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn77114"

RPM_NAME = "texlive-scrabble-2026.226.0.0.20asvn77114-60.2.noarch.rpm"
RPM_HASH = "a8aa62bd8ded20aade7105924ed1b2a4a31317dc3658cd9f294046a225529ff9b8b3cd40781ab3cb045ea5d1f6ec0b77b3adba8e7e6a8b78b18a704989005e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Scrabble.sty \
texlive-scrabble"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-randintlist.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
