SUMMARY = "Extensions of LaTeX picture drawing"
DESCRIPTION = "The package extends the facilities of the pict2e and the \
curve2e packages, providing extra reference frames, conic \
section curves, graphs of elementary functions and other \
parametric curves."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn28770"

RPM_NAME = "texlive-xpicture-2026.226.1.2asvn28770-59.4.noarch.rpm"
RPM_HASH = "2fc3221421b6e1cc072aa327e23cda31dee50dfe9740fdc6e8bf8d43cd66911050801c0b102dc9bb199752dd501af3a3327a1599b296bd5983c215455175dfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpicture.sty \
texlive-xpicture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calculus.sty \
tex-curve2e.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
