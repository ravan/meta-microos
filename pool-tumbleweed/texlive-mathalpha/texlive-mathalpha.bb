SUMMARY = "General package for loading maths alphabets in LaTeX"
DESCRIPTION = "Package mathalfa was renamed to mathalpha. For backward \
compatibility the old name will continue to be recognized in \
LaTeX documents. The package provides means of loading maths \
alphabets (such as are normally addressed via macros \\mathcal, \
\\mathbb, \\mathfrak and \\mathscr), offering various features \
normally missing in existing packages for this job."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.145svn77682"

RPM_NAME = "texlive-mathalpha-2026.226.1.145svn77682-59.2.noarch.rpm"
RPM_HASH = "c9eb9b86232984e44e6fde5ed6d8fb9064e59b30d8e2800d19abd8afb4c0b22069e6cbd55d94014df567cc6d9ed325be7c6b402140bb5c4084c0af9c6ee92e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathalfa.sty \
tex-mathalpha-ncmbb-bold.tfm \
tex-mathalpha-ncmbb-book.tfm \
tex-mathalpha-ncmbb-regular.tfm \
tex-mathalpha.map \
tex-mathalpha.sty \
texlive-mathalpha"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bboldx.sty \
tex-dsserif.sty \
tex-tx-ds.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mathalpha-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
